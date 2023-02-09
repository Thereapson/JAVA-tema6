package com.company.arrayLists;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArraryList1 {

    public  static  void  arrayList1(){


        ArrayList<String> arrList1 = new ArrayList<String>();
        arrList1.add("Pizza");
        arrList1.add("Hamburguesa");
        arrList1.add("SalchiPapa");
        arrList1.add("SandWish");

        LinkedList<String> listaLinked = new LinkedList<String>();
        arrList1.add("Pizza");
        arrList1.add("Hamburguesa");
        arrList1.add("SalchiPapa");
        arrList1.add("SandWish");

        for (int i = 0; i<arrList1.size();i++){
            System.out.println(arrList1.get(i));
        }

        for (int i = 0; i<listaLinked.size();i++){
            System.out.println(arrList1.get(i));
        }
    }
}
