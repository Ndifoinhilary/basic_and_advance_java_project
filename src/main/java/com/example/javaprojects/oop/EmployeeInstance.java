package com.example.javaprojects.oop;

public class EmployeeInstance {
    public static void main(String[] args) {
        var employ1 = new Employee("Hilary", 21, 1200 , "Bamenda");
        var employ2 = new Employee("John", 23, 1200 , "Bamenda");
        System.out.println(employ1.raiseSalary());
    }
}
