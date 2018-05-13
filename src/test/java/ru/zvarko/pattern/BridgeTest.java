package ru.zvarko.pattern;

import org.testng.annotations.Test;
import ru.zvarko.pattern.structural.bridge.*;

@Test
public class BridgeTest {

    @Test
    public void doBridge() {
        Bridging br1 = new BridgingOne(new BridgedOne("hello"));
        Bridging br2 = new BridgingTwo(new BridgedTwo("bye"));
        br1.doBridge();
        br2.doBridge();
    }
}
