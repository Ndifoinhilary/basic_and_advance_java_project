package com.example.javaprojects;

import java.util.Scanner;

public class CalculateBill {

    public static void main(String[] args) {
        System.out.println("Calculating wate bill for a user");

        Scanner scanner =  new Scanner(System.in);
        System.out.print("How many gallons of water do you user  : ");
        double  usage = scanner.nextDouble();

            if (usage > 0){
                System.out.println("Your water bill is  "+ calculateWaterBill(usage) + " USD");

            }
            else {
                System.out.println("You entered a nagetive number ");
            }

        scanner.close();

    }
    public static double calculateWaterBill(double usage){
        double minimumWaterBill = 18.84;
        double numberOfGallonsInCFF = 748;
        double includeGallons = 2 * numberOfGallonsInCFF;
        if (usage <= includeGallons){
            return minimumWaterBill;
        }else {
            double extraGallons = usage - includeGallons;
            double extraAmountOwnd = Math.ceil(extraGallons / numberOfGallonsInCFF) * 3.9;
            return minimumWaterBill + extraAmountOwnd;
        }

    }
}
