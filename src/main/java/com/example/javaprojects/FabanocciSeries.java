package com.example.javaprojects;

import java.util.Scanner;

public class FabanocciSeries {
    public static void main(String[] args) {
        System.out.println("Displaying the fabanocci series ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of numbers in you want in the series :  ");
        int n = scanner.nextInt();
//        calling the method to show the numbers
        fabanocciSeries(n);
        scanner.close();
    }
//    We have use f01,f1, f02 and you know that f0=f1=1 so f1=f0 while we are calculating from f1 > n
    static void  fabanocciSeries(int n){
        int f01 = 1, f1=0,count=1,f02=0;
        while (count <= n){
            System.out.print(f02 + "  ");
            f02 = f01 + f1;
            f01 = f1;
            f1 = f02;
            count ++;
        }
    }
}
