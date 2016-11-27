package com.virgil.learn.echipament.classes.biciclete;

import com.virgil.learn.echipament.interfaces.Bicicleta;

public class Cursiera implements Bicicleta{
    int pinion = 0;
    int foaie = 0;
    int frana = 0;

    public int getPinion() {return pinion;}
    public int getFoaie() {return foaie;}
    public int getFrana() {return frana;}

    public void schimbaPinion(int valoareNoua) {
        pinion = valoareNoua;
    }
    public void schimbaFoaie(int valoareNoua) {
        foaie = valoareNoua;
    }
    public void schimbaFrana(int valoareNoua) {
        frana = valoareNoua;
    }

    public void afiseazaStare() {
        System.out.print("pinion:" + pinion + " foaie:" + foaie + " frana:" + frana);
    }
}
