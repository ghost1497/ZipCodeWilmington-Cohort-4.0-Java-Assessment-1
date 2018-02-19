package com.zipcodewilmington.assessment1.part4;

import org.junit.Assert;
import org.junit.Test;

public class JumperTest {

    @Test
    public void solution0() {
        Jumper jumper = new Jumper();
        Integer actual = jumper.jumps(3, 1);
        Integer expected = 3;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void solution1() {
        // Should assert to true
        Jumper jumper = new Jumper();
        Integer actual = jumper.jumps(3, 2);
        Integer expected = 2;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void solution2() {
        // Should assert to true
        Jumper jumper = new Jumper();
        Integer actual = jumper.jumps(3, 3);
        Integer expected = 1;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void solution3() {
        // Should assert to true
        Jumper jumper = new Jumper();
        Integer expected = 16808;
        Integer actual = jumper.jumps(16808, 282475250);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void solution4() {
        // Should assert to true
        Jumper jumper = new Jumper();
        Integer actual = jumper.jumps(458777924, 7237710);
        Integer expected = 2802257;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void solution5() {
        // Should assert to true
        Jumper jumper = new Jumper();
        Integer actual = jumper.jumps(823564441, 115438166);
        Integer expected = 15497286;
        Assert.assertEquals(expected, actual);

    }
}
