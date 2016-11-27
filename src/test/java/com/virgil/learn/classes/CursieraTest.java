package com.virgil.learn.classes;

import com.virgil.learn.echipament.classes.biciclete.Cursiera;
import junit.framework.Assert;
import org.junit.Test;

public class CursieraTest {
    @Test
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
