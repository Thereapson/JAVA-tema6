package com.company.exceptions;

import java.io.FilterOutputStream;
import java.util.Scanner;

public class aritmetica {

    public static void  DividePorCero(){

        Scanner numero = new Scanner(System.in);
        int numeroA;
        int numeroB;

        System.out.println("inserte dos números");
        numeroA = numero.nextInt();
        numeroB = numero.nextInt();


        try{
          int resultado = numeroA/numeroB;
            System.out.println(resultado);
        } catch (ArithmeticException e){
            System.out.println("Esto no  puede hacerse ");
        } finally {
            System.out.println("Demo de código");
        }
    }
}
