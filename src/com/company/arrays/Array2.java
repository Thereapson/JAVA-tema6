package com.company.arrays;

public class Array2 {

    public  static  void arr2(){

        int arrayUno[][] = new int[5][2];
        arrayUno[0][0] = 1; arrayUno[0][1] = 10;
        arrayUno[1][0] = 2; arrayUno[1][1] = 20;
        arrayUno[2][0] = 3; arrayUno[2][1] = 30;
        arrayUno[3][0] = 4; arrayUno[3][1] = 40;
        arrayUno[4][0] = 5; arrayUno[4][1] = 50;

        for(int i = 0; i < arrayUno.length; i++){
            for (int j = 0; j<arrayUno[1].length; j++){
                System.out.println("estoy en i: " + i + " j = " + j);
                System.out.println("y el contenido es :" + arrayUno[i][j]);
            }
        }



    }
}
