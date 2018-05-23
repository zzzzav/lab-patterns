package ru.zvarko.pattern;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.zvarko.pattern.behavioral.chain_resp.FilterChain;
import ru.zvarko.pattern.behavioral.chain_resp.FilterImpl;

import java.util.Arrays;
import java.util.Collection;

@Test
public class ChainTest {
    @Test
    public void ChainTest() {
        Collection<String> collection = Arrays.asList("one", "two", "three", "four", "1", "2");
        FilterChain chain1 = new FilterImpl( s ->
        {
            try {
                Integer i = Integer.valueOf(s) * 10;
                return i.toString();
            } catch (NumberFormatException e) {
                return s;
            }
        }
        );
        FilterChain chain2 = new FilterImpl(s -> s.concat(" hundreds"));
        chain1.setNext(chain2);
        collection = chain1.apply(collection);
        Collection<String> collection2 = Arrays.asList("one hundreds", "two hundreds"
                , "three hundreds", "four hundreds"
                , "10 hundreds", "20 hundreds");
        System.out.println(collection);
        Assert.assertEquals(collection, collection2);
    }
}
