package com.test;
import java.util.*;



public class Main {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(3);
        set1.add(5);

        Set<Integer> set2 = new HashSet<>(set1);
        set2.add(6);
        set2.add(8);
        System.out.println("set2 = " + set2);

        Set<Integer> set3 = new HashSet<>();
        set3.add(2);
        set3.add(4);
        set3.add(1);
        set3.add(7);
        System.out.println("set3 = " + set3);

        //union
        Set<Integer> union = new HashSet<>(set2);
        union.addAll(set3);
        System.out.println("union = " + union);

    }
}

