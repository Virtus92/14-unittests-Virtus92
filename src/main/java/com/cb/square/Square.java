package com.cb.square;

public class Square {
    public int calculate(int x) {
        if (x<0) throw new IllegalArgumentException("Fehler, die eingegebene Zahl kann nicht kleiner als 0 sein!");
        return x*x;
    }
}
