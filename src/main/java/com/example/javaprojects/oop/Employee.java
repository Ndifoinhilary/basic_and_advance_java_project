package com.example.javaprojects.oop;

public class Employee {
    private String name;
    private int age;
    private double salary;
    private String location;

    public Employee(String name, int age, double salary, String location) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public  double raiseSalary(){
        if (this.salary < 100){
            return this.salary + 100;
        }
        return this.salary;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", salary=" + salary +
                ", location='" + location + '\'' +
                '}';
    }
}
