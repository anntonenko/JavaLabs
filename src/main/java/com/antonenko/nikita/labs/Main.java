package com.antonenko.nikita.labs;

public class Main {
    public static void main(String[] args) {
        Matrix laba4 = new Matrix();
        laba4.initRandom(1000, 10);
        laba4.print();

        System.out.println();
        System.out.println("Maxmimum: " + laba4.max());
        System.out.println("Minimum: " + laba4.min());
        System.out.println("Maxmimum Api: " + laba4.maxApi());
        System.out.println("Minimum Api: " + laba4.minApi());

    }
}
