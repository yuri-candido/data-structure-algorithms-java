package com.loiane.datastructure.array.test;

import com.loiane.datastructure.array.Array;

public class Class04 {

    public static void main(String[] args) {

        Array array = new Array(2);

        array.add("element 1");
        array.add("element 2");
        array.add("element 3");

        System.out.println(array.size());
        System.out.println(array.toString());

    }
}
