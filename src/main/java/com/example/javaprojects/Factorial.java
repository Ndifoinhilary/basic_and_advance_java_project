package com.example.javaprojects;
import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        System.out.println("Calculating Factorial of a number n where n is any number from the user");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number you want the factorial for :  ");
        int n = scanner.nextInt();
        int result = factorial(n);
        System.out.print("The factorial of "+ n + " is "+ result);
        scanner.close();
    }
    static int factorial(int n){
        int result = 1;
        if(n <0){
            System.out.println("The factorial of a nagetive number does not exits");
        }
        else if (n == 0){
            result = 1;
        }
        else {
            result = n * factorial(n-1);
        }
        return result;
    }
}
