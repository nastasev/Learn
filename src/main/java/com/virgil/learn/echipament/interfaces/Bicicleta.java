package com.virgil.learn.echipament.interfaces;

/**
 * Created by Virgil on 26.11.2016.
 */

public interface Bicicleta {
    void schimbaPinion(int valoareNoua);
    void schimbaFoaie(int valoareNoua);
    void schimbaFrana(int valoareNoua);
    default void schimbaSuspensie(int valoareNoua) {System.out.print(" __schimbaSuspensie__ "); }
    void afiseazaStare();
}
