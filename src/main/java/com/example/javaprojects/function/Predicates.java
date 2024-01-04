package com.example.javaprojects.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Predicates {

    public static void main(String[] args) {
//        checking if a number is even
        Integer[] inarray = {1,3,5,2,6,7,8};
        List<Integer> integerList = new ArrayList<>(Arrays.asList(inarray));

        Predicate<Integer> isEven = (x) -> x % 2 == 0;

        List<Integer> collect = integerList.stream().filter(isEven).collect(Collectors.toList());

        System.out.println(collect);

        Function<Integer, Predicate<String>> getWord = (minlength) -> {

            return (str) -> str.length() > minlength;
        };

        Predicate<String> isLength3 = getWord.apply(3);
//checking all the word of a list that is greater then 5 characters

        String[] wordlist = {"Hello", "Functional", "Java", "Spring Boot", "Spring"};

        List<String> words = new ArrayList<>(Arrays.asList(wordlist));

        Predicate<String> length = (x) -> x.length() > 5;

        List<String> collect1 = words.stream().filter(isLength3).collect(Collectors.toList());

        System.out.println(collect1);
    }
}
