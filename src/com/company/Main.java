package com.company;

import static com.company.arrayLists.ArraryList1.arrayList1;
import static com.company.arrayLists.ArraryList2.arrayList2;
import static com.company.arrays.Array1.arr1;
import static com.company.arrays.Array2.arr2;
import static com.company.exceptions.aritmetica.DividePorCero;
import static com.company.vectors.Vector1.vec1;
import static com.company.Revert.reverse;

public class Main {
    public static void main(String[] args) {



        System.out.println("la cadena invertida es: "+ reverse("Hola mundo!"));

     arr1();

     arr2();

    vec1();

    /*

     La razón por la cual no se debe utilizar un VECTOR con  la capacidad por defecto se debe a que si el vector
      tiene 1000 items entonces el espacio que genería el vector sería el doble,
     el cual usaría y desgastaria muchos recursos.

     */

     arrayList1();

    arrayList2();

    DividePorCero();

     }
}