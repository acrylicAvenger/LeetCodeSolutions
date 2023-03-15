package com.Khushan;

import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
    public static void main(String[] args) {
        HashSet <Integer> myHashSet = new HashSet<>(6,0.5f);
        //load factor is a percentage value which decides when the hashset size must be increased
        //for above case the hashset size will increase when 3 elements are added into the hashset
        myHashSet.add(13);
        myHashSet.add(13);
        myHashSet.add(23);
        myHashSet.add(7);
        System.out.println(myHashSet);
        if(myHashSet.contains(12)){
            System.out.println("Contains 12");
        }
        if(!myHashSet.contains(12)){
            System.out.println("Does not contain 12");
        }
        //iterator is a variable that iterates through a data structure like i in for loop
        //hash sets also have an iterator
        Iterator iterator = myHashSet.iterator(); //has two methods next() and hasNext()

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
