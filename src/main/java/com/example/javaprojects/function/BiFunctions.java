package com.example.javaprojects.function;

import java.util.function.BiFunction;

public class BiFunctions {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;
        System.out.println(add.apply(34, 53));

        TryFunction<Integer, Integer,Integer,Integer,Integer>fourAdd = (u,v,w,x) -> u + v + w + x;
        System.out.println(fourAdd.apply(12,34,53,23));
    }
}
