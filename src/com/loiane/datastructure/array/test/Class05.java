package com.loiane.datastructure.vector.test;

import com.loiane.datastructure.vector.Vector;

public class Class05 {
    public static void main(String[] args) {

        Vector vector = new Vector(8);

        vector.add("element 1");
        vector.add("element 2");
        vector.add("element 3");

        System.out.println(vector.search(1));
        System.out.println(vector.search(3));
    }
}
