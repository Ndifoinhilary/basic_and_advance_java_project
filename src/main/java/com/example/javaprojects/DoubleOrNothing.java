package com.example.javaprojects;

import java.util.Random;
import java.util.Scanner;

public class DoubleOrNothing {
    private static int startPoints = 10;
    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();
    private int current = startPoints;
    private boolean isStillPlaying = true;

    public void playGame(){
        printWelcome();
        askUserToContinue();

        while (this.isStillPlaying){
            printTryToDouble();
            if (shouldDouble()){
                doubleCurrent();
                printCongrates();
            }
            else {
                printLost();
                return;
            }
        }
        printWalkawayMessage();
    }
    public void printWelcome(){
        System.out.println("Lets play double or nothing. We'll start you with inital 10 points");
    }
    public void printTryToDouble(){
        System.out.println("Let's try tto double it'");
    }
    public void printCongrates(){
        System.out.println("Congrate! you have " + this.current + " points now");
    }
    public void printLost(){
        System.out.println("Uh oh. You've lost. No point for you");
    }

    public  void printWalkawayMessage(){
        System.out.println("Congrates! You finish with " + this.current + " points");
    }
    private boolean shouldDouble(){
        return  this.random.nextInt(2) == 0;
    }
    private  void doubleCurrent(){
        this.current = this.current * 2;
    }

    protected void askUserToContinue(){
        System.out.println("Would you like to continue and try to double you're points ..?");
        this.isStillPlaying = this.scanner.nextLine().toUpperCase().equals("YES");
    }
    protected boolean getIsStillPlaying(){
        return this.isStillPlaying;
    }
}
