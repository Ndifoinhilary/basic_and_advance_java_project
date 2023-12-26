package com.example.javaprojects;

import java.util.Scanner;

public class VerifyPassword {
    public static void main(String[] args) {
        System.out.println("Chcking the complexicity of a password....");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the password to verify  .....: ");
        String password = scanner.next();
        System.out.println( " Your password entered is complex "+ complexPassword(password));
        System.out.print( " Your password entered is complex enough "+ isComplePassword(password));
        scanner.close();
    }
//    method 1
    static boolean complexPassword(String password) {
        if (password.length() < 6){
            return false;
        }
        boolean hasLowerCaseLetter = false;
        boolean hasUpperCaseLetter = false;
        boolean hasNumber = false;
        for (int i = 0 ; i < password.length() || !hasLowerCaseLetter && !hasUpperCaseLetter && !hasNumber; i++){
            char current = password.charAt(i);
            if (Character.isDigit(current)){
                hasNumber = true;
            } else if (Character.isUpperCase(current)) {
                hasUpperCaseLetter =true;
            } else if (Character.isLowerCase(current)) {
                hasLowerCaseLetter = true;
            }
        }
        return hasNumber && hasLowerCaseLetter && hasUpperCaseLetter;
    }

//    method 2
    static boolean isComplePassword(String password){
        return  password.length() >= 6 && password.matches(".*\\d.*")&& password.matches(".*[a-zA-Z].*");
    }
}
