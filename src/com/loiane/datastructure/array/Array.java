package com.loiane.datastructure.array;

import java.util.Arrays;

public class Array {

    private String[] elements;
    private int size;

    public Array(int capacity) {
        this.elements = new String[capacity];
        this.size = 0;
    }

    public boolean add(String element) {
        this.increasesCapacity();
        if (this.size < this.elements.length) {
            this.elements[this.size] = element;
            this.size++;
            return true;
        }
        return false;
    }

    public boolean add(int position, String element) {

        if (!(position >= 0 && position < size)) {
            throw new IllegalArgumentException("invalid position");
        }

        this.increasesCapacity();

        for (int i=this.size-1; i>=position; i--) {
            this.elements[i+1] = this.elements[i];
        }

        this.elements[position] = element;
        this.size++;

        return true;
    }

    private void increasesCapacity() {
        if (this.size == this.elements.length) {
            String[] newElements = new String[this.elements.length * 2];
            for (int i=0; i<this.elements.length; i++) {
                newElements[i] = this.elements[i];
            }
            this.elements = newElements;
        }
    }

    public String search(int position) {
        if (!(position>=0 && position < size)) {
            throw new IllegalArgumentException("invalid position!");
        }
        return this.elements[position];
    }

    public int search(String element) {
       for(int i=0; i<size; i++) {
           if(elements[i].equals(element)) {
               return i;
           }
       }
       return -1;
    }

    public int size() {
        return this.size;
    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i=0; i<this.size-1; i++) {
            s.append(this.elements[i]);
            s.append(", ");
        }

        if(this.size>0){
            s.append(this.elements[this.size-1]);
        }

        s.append("]");
        return Arrays.toString(elements);
    }
}
