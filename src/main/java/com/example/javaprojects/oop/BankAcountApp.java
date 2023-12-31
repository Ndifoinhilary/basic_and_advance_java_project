package com.example.javaprojects.oop;

public class BankAcountApp {
    public static void main(String[] args) {
        var bank = new BankAcount("Hilary", 9000);

        bank.deposite(20000);
        System.out.println("You current balance is " + bank.getBalance());
        bank.withdraw(1000);
        System.out.println("You current balance is " + bank.getBalance());
    }
}
