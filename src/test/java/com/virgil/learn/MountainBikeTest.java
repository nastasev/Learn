package com.virgil.learn;

import com.virgil.learn.echipament.classes.biciclete.MountainBike;
import junit.framework.Assert;
import org.junit.Test;

public class MountainBikeTest {
    @Test
    public void testGetSet() {
        MountainBike mountainBike = new MountainBike();

        mountainBike.schimbaPinion(1);
        Assert.assertEquals(1, mountainBike.getPinion());

        mountainBike.schimbaFoaie(3);
        Assert.assertEquals(3, mountainBike.getFoaie());

        mountainBike.schimbaFrana(2);
        Assert.assertEquals(2, mountainBike.getFrana());

        mountainBike.schimbaSuspensie(1);
        Assert.assertEquals(1,mountainBike.getSuspensie());
    }
}
