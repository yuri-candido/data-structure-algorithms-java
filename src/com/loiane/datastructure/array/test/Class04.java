package com.loiane.datastructure.vector.test;

import com.loiane.datastructure.vector.Vector;

public class Class04 {

    public static void main(String[] args) {

        Vector vector = new Vector(2);

        vector.add("element 1");
        vector.add("element 2");
        vector.add("element 3");

        System.out.println(vector.size());
        System.out.println(vector.toString());

    }
}
