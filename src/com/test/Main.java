package com.test;
import java.util.*;



public class Main {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>(set1);
        set1.add(1);
        set1.add(3);
        set1.add(5);
        set2.add(6);
        set2.add(8);
        System.out.println("set1 = " + set1);
        System.out.println("set2 = " + set2);

    }
}

