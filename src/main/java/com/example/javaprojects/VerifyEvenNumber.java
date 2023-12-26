package com.example.javaprojects;

import java.util.Scanner;

public class VerifyEvenNumber {
    public static void main(String[] args) {
        System.out.println("Verifying if a number is even or not");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to verify  .....: ");
        int number = scanner.nextInt();
        System.out.print("is " +  number +  " an even number...?  "+ verifyNumber(number));
        scanner.close();
    }

    static boolean verifyNumber(int number){
       return number % 2 == 0;
    }
}
