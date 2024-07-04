package com.loiane.datastructure.array.test;

import com.loiane.datastructure.array.Array;

public class Class07 {

    public static void main(String[] args) {

        Array array = new Array(5);
        array.add("element 0");
        array.add("element 1");
        array.add("element 3");
        array.add("element 4");

        System.out.println(array);

        array.add(2,"element 2");

        System.out.println(array);


    }
}
