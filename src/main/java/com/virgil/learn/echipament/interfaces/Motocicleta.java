package com.virgil.learn.echipament.interfaces;

public interface Motocicleta extends Bicicleta {
    default void schimbaViteza(int valoareNoua) {}
}
