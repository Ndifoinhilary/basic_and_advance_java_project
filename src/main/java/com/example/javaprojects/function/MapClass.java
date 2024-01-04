package com.example.javaprojects.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MapClass {

    public static void main(String[] args) {
        Integer[] inarray = {1,3,5,2,6,7,8};
        List<Integer> integerList = new ArrayList<>(Arrays.asList(inarray));

        List<Integer> doubleList = new ArrayList<>();
        for (int i = 0 ; i < integerList.size(); i++){
            Integer result = integerList.get(i) * 2;
            doubleList.add(result);
        }
        Function<Integer,Integer> timeTwo = (x) -> x * 2;
        List<Integer> collect = integerList.stream().map(timeTwo).collect(Collectors.toList());
        System.out.println(collect);
    }
}
