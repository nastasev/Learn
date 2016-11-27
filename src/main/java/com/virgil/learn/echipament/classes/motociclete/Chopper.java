package com.virgil.learn.echipament.classes.motociclete;

import com.virgil.learn.echipament.interfaces.Motocicleta;

public class Chopper implements Motocicleta {
    int pinion = 0;
    int foaie = 0;
    int frana = 0;

    @Override
    public void schimbaPinion(int valoareNoua) {
        pinion = valoareNoua;
    }

    @Override
    public void schimbaFoaie(int valoareNoua) {
        foaie = valoareNoua;
    }

    @Override
    public void schimbaFrana(int valoareNoua) {
        frana = valoareNoua;
    }

    @Override
    public void afiseazaStare() {
        System.out.print("pinion:" + pinion + " foaie:" + foaie + " frana:" + frana);
    }
}
