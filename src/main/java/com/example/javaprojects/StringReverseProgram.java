package com.example.javaprojects;

import java.util.Scanner;

public class StringReverseProgram {
    public static void main(String[] args) {
        System.out.println("revrsersing a line of text in java  ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the line of text you want to reverse :  ");
        String textLine = scanner.nextLine();
        String reverse = reverseString(textLine);
        System.out.print( "The reverse of the string is : " + reverse);
        scanner.close();
    }
    static String reverseString(String textLine){
        String[] words = textLine.split(" ");
        String revString = "";
        for(String word : words){
            StringBuilder stringBuilder = new StringBuilder(word);
            revString = revString+stringBuilder.reverse()+" ";
        }

        return  revString;
    }
}
