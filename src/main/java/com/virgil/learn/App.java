package com.virgil.learn;


import com.virgil.learn.echipament.classes.biciclete.Cursiera;
import com.virgil.learn.echipament.classes.biciclete.MountainBike;
import com.virgil.learn.echipament.classes.motociclete.Chopper;
import com.virgil.learn.echipament.interfaces.Bicicleta;
import com.virgil.learn.echipament.interfaces.Motocicleta;

public class App
{
    public static void main( String[] args )
    {
        Bicicleta bicicleta1 = new MountainBike();
        Bicicleta bicicleta2 = new MountainBike();
        Bicicleta bicicleta3 = new Cursiera();
        Motocicleta motocicleta1 = new Chopper();

        System.out.print("1 - MountainBike ==> ");
        bicicleta1.schimbaPinion(2);
        bicicleta1.schimbaFoaie(3);
        bicicleta1.schimbaFrana(1);
        bicicleta1.afiseazaStare();
        System.out.println("");

        System.out.print("2 - MountainBike ==> ");
        bicicleta2.schimbaPinion(1);
        bicicleta2.schimbaFoaie(1);
        bicicleta2.schimbaFrana(2);
        bicicleta2.afiseazaStare();
        System.out.println("");

        System.out.print("3 - Cursiera ==> ");
        bicicleta3.schimbaPinion(4);
        bicicleta3.schimbaFoaie(2);
        bicicleta3.schimbaFrana(3);
        bicicleta3.schimbaSuspensie(2);
        bicicleta3.afiseazaStare();
        System.out.println("");

        System.out.print("4 - Chopper ==> ");
        motocicleta1.schimbaPinion(4);
        motocicleta1.schimbaFoaie(2);
        motocicleta1.schimbaFrana(3);
        motocicleta1.schimbaSuspensie(2);
        motocicleta1.afiseazaStare();
        
        System.out.println("Done");
    }
}
