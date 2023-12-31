package com.example.javaprojects.oop;

public class BankAcount {
    private String owner;
    private double balance;

    BankAcount(String owner , double balance){
        this.owner = owner;
        this.balance = balance;
    }

    public void  setOwner(String owner){
        this.owner = owner;
    }
    private  String getOwner(){
        return  this.owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 0){
            System.out.println(" Sorry balance can't be less then 0");
        }
        this.balance = balance;
    }
    public  void withdraw(double amount){

        if (amount > this.balance){
            System.out.println("You don't have sufficient funs please");
        }
        this.balance = this.balance - amount;
    }

    public void deposite(double amount){
        this.balance = this.balance + amount;
        System.out.println("You have successfully deposited " + amount + " and your current account is  "+ this.balance);
    }
}
