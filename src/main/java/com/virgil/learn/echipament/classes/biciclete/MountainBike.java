package com.virgil.learn.echipament.classes.biciclete;

import com.virgil.learn.echipament.interfaces.Bicicleta;

public class MountainBike extends Cursiera implements Bicicleta {
    int suspensie = 0;

    @Override
    public void schimbaSuspensie(int valoareNoua) {
        suspensie = valoareNoua;
    }

    @Override
    public void afiseazaStare() {
        super.afiseazaStare();
        System.out.print(" suspensie:" + suspensie);
    }
}
