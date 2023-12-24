package com.example.javaprojects;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Checking if a word is Palindrome or not ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the word you want to check :  ");
        String word = scanner.next();
        if (isPalindrome(word)){
            System.out.print("\"" + word +"\"  is palindrome ");
        }
        else {
            System.out.print("\"" +word +"\" Is not palindrome");
        }
    }
    static boolean isPalindrome(String word){
        int forwardIndex = 0, backwardIndex= word.length()-1;
       while (forwardIndex <= backwardIndex){
           char startChar = word.charAt(forwardIndex);
           char endChar = word.charAt(backwardIndex);
           if (startChar != endChar){
               return false;
           }
           forwardIndex ++;
           backwardIndex --;
       }

        return true;
    }
}
