package com.company.entradas;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class EntradaSalida {

    public  static  void  fileIn(){

        try {
            InputStream fichero = new FileInputStream("/etc/paswd");
            try {
                byte[] datos = fichero.readAllBytes();

                for (byte dato : datos){
                    System.out.println((char) dato);
                }
            } catch (IOException e) {
                System.out.println("No se pudo leer" + e.getMessage());
            }
        } catch (FileNotFoundException e){
            System.out.println("Que hay un error" + e.getMessage());
        }
    }
}
