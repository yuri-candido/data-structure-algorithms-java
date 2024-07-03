package com.loiane.datastructure.array.test;

import com.loiane.datastructure.array.Array;

import java.util.Vector;

public class Class06 {

    public static void main(String[] args) {

        Array array = new Array(3);
        array.add("element 1");
        array.add("element 2");
        array.add("element 3");

        System.out.println(array.search("element 1"));
        System.out.println(array.search("element 2"));
        System.out.println(array.search("element 4"));
        System.out.println(array.search("element 3"));
    }
}
