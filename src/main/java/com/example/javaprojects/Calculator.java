package com.example.javaprojects;
import  java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Enter the first number : ");
         double  no1 = scanner.nextDouble();
        System.out.print("Enter the second number:  ");
        double no2 = scanner.nextDouble();
        System.out.print("Enter your operator [-,+,*,/,]: ");

        char operator = scanner.next().charAt(0);
        double result = calculator(no1, no2, operator);

        System.out.println(no1  +" "+ operator + " " + no2 + "is"+ result);

        scanner.close();
    }
//    Method to perform the caculation
    static double calculator(double no1, double no2, char operator){
        double result = 0;
        switch (operator){
            case '+':
                result = no1 + no2;
                break;
            case '-':
                result = no1 - no2;
                break;
            case '/':
                result = no1 / no2 ;
                break;
            case '%':
                result = no1 % no2;
                break;
            case '*':
                result = no1 * no2;
                break;
            default:
                System.out.println("Invalid Operation");
        }
        return result;
    }

}
