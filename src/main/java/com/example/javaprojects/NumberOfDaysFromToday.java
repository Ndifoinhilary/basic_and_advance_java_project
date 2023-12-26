package com.example.javaprojects;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

public class NumberOfDaysFromToday {
    static LocalDate calculateHundrentDaysFromNow(LocalDate today){
        Period hundrentDays = Period.ofDays(100);
        return today.plus(hundrentDays);
    }

    public static void main(String[] args) {
        LocalDate today = LocalDate.now(ZoneId.of("Africa/Douala"));
        System.out.println("100 days from today is .... " + calculateHundrentDaysFromNow(today));
    }
}
