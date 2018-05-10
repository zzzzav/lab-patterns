package ru.zvarko.pattern;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.zvarko.pattern.creational.singleton.*;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

@Test
public class SingletonTest {

    private static final int MAX_THREADS = 20;
    static CyclicBarrier cyclicBarrier = new CyclicBarrier(MAX_THREADS);

    @Test
    public void simpleSingletonTest() {
        MySingleton ss1 = SimpleSingleton.getInstance();
        MySingleton ss2 = SimpleSingleton.getInstance();
        Assert.assertTrue(ss1 == ss2);
    }

    @Test
    public void staticBlockSingletonTest() {
        MySingleton ss1 = StaticBlockSingleton.getInstance();
        MySingleton ss2 = StaticBlockSingleton.getInstance();
        Assert.assertTrue(ss1 == ss2);
    }

    @Test
    public void lazyInitSingletonTest() {
        MySingleton ss1 = LazyInitSingleton.getInstance();
        MySingleton ss2 = LazyInitSingleton.getInstance();
        Assert.assertTrue(ss1 == ss2);
    }

    @Test
    public void threadSafeSingletonTest() {
        MySingleton ss1 = ThreadSafeSingleton.getInstance();
        MySingleton ss2 = ThreadSafeSingleton.getInstance();
        Assert.assertTrue(ss1 == ss2);
    }

    @Test
    public void multithreadSingletonCheck() throws InterruptedException {
        SingletonGetter[] getters = new SingletonGetter[MAX_THREADS];
        Thread[] threads = new Thread[MAX_THREADS];
        System.out.println();
        for (int i = 0; i < MAX_THREADS; i++) {
            SingletonGetter getter = new SingletonGetter();
            getters[i] = getter;
            Thread th = new Thread(getter);
            th.start();
            threads[i] = th;
        }
        for (Thread th : threads) {
            th.join();
        }
        for (SingletonGetter getter : getters) {
            System.out.println(getter.getSingleton() + " " + getter.getTsSingleton());
        }

        boolean allSingletonsEquals = true;
        boolean allTsSingletonsEquals = true;
        for (int i = 0; i < MAX_THREADS - 1; i++) {
            allSingletonsEquals &= getters[i].getSingleton() == getters[i + 1].getSingleton();
            allTsSingletonsEquals &= getters[i].getTsSingleton() == getters[i + 1].getTsSingleton();
        }
        System.out.println("allSingletonsEquals? " + allSingletonsEquals);
        System.out.println("allTsSingletonsEquals? " + allTsSingletonsEquals);
    }


    private static class SingletonGetter implements Runnable {

        private MySingleton singleton;
        private MySingleton tsSingleton;

        public MySingleton getSingleton() {
            return singleton;
        }

        public MySingleton getTsSingleton() {
            return tsSingleton;
        }

        public void run() {
            try {
                cyclicBarrier.await();
                singleton = LazyInitSingleton.getInstance();
                tsSingleton = ThreadSafeSingleton.getInstance();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }
}
