package com.company.arrayLists;

import java.util.ArrayList;

public class ArraryList2 {

    public static void arrayList2(){

        int numero = 1;

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = numero; i<=10; i++){
            list.add(numero);
            numero++;
        }

        System.out.println(list);

       for (int i = 0;  i < list.size(); i ++){

           if ( list.get(i) %2 == 0 ) {
               list.remove(i);
           }
        }

        System.out.println(list);
    }
}
