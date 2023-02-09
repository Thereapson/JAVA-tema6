package com.company.vectors;

import java.util.Vector;

public class Vector1 {

    public  static  void vec1(){

        Vector<Integer> vector1 = new Vector();
        vector1.add(2);
        vector1.add(4);
        vector1.add(6);
        vector1.add(8);
        vector1.add(10);

        System.out.println("vector incial: " + vector1);

        vector1.remove(2);
        vector1.remove(1);
        System.out.println("vector final: " + vector1);




    }
}
