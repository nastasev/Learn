package com.virgil.learn;

import com.virgil.learn.echipament.classes.biciclete.Cursiera;
import junit.framework.Assert;

public class CursieraTest {
    public void testGetSet() {
        Cursiera cursiera = new Cursiera();

        cursiera.schimbaPinion(1);
        Assert.assertEquals(1,cursiera.getPinion());

        cursiera.schimbaFoaie(3);
        Assert.assertEquals(3,cursiera.getFoaie());

        cursiera.schimbaFrana(2);
        Assert.assertEquals(2,cursiera.getFrana());
    }
}
