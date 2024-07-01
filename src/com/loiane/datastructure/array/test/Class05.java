package com.loiane.datastructure.array.test;

import com.loiane.datastructure.array.Array;

public class Class05 {

    public static void main(String[] args) {

       Array array = new Array(8);

        array.add("element 1");
        array.add("element 2");
        array.add("element 3");

        System.out.println(array.search(1));
        System.out.println(array.search(3));

    }
}
