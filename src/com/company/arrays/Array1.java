package com.company.arrays;

public class Array1 {

    public static void arr1(){
        String arrayUno[] = new String[5];
        arrayUno[0] = "Posicion 1";
        arrayUno[1] = "Posicion 2";
        arrayUno[2] = "Posicion 3";
        arrayUno[3] = "Posicion 4";
        arrayUno[4] = "Posicion 5";

        for (int i = 0; i < arrayUno.length; i++) {
            System.out.println(arrayUno[i]);
        }
    }
}
