package com.example.javaprojects;

import java.util.Arrays;

public class MirroInverse {
    public static void main(String[] args) {
        int[] array = {3,4,2,0,1};
        if (isMirroInverse(array)){
            System.out.print(Arrays.toString(array) + " is a real mirror inverse array");
        }
        else {
            System.out.println("Not a mirror inverse array");
        }
    }

    static boolean isMirroInverse(int[] array){
        for (int i = 0 ; i < array.length ; i++){
            if (array[array[i]] != i){
                return false;
            }
        }
        return true;
    }
}
