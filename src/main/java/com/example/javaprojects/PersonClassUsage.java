package com.example.javaprojects;

public class PersonClassUsage {
    public static void main(String[] args) {
        var person = new  Person("Ndifoin" ,"Hilary" , 12);
        person.introduceYourSelf();
        System.out.println( person.toString());
    }
}
