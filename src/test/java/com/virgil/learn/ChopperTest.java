package com.virgil.learn;

import com.virgil.learn.echipament.classes.motociclete.Chopper;
import junit.framework.Assert;
import org.junit.Test;

public class ChopperTest {
    @Test
    public void testGetSet() {
        Chopper chopper = new Chopper();

        chopper.schimbaPinion(1);
        Assert.assertEquals(1, chopper.getPinion());

        chopper.schimbaFoaie(3);
        Assert.assertEquals(3, chopper.getFoaie());

        chopper.schimbaFrana(2);
        Assert.assertEquals(2,chopper.getFrana());
    }
}
