package com.company;

import java.util.Scanner;

public class Revert {

    public static String reverse(String texto) {

        System.out.println("La cadena a invertir es: " + texto);

        String cadenaInvertida = "";

        for (int x = texto.length() - 1; x >= 0; x--)
            cadenaInvertida = cadenaInvertida + texto.charAt(x);


        return cadenaInvertida;
    }
}
