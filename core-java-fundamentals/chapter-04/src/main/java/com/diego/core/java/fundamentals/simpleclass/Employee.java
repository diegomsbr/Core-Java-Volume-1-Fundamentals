package com.diego.core.java.fundamentals.simpleclass;

import java.time.LocalDate;
import java.util.Date;

public class Employee {

    private String name;
    private double salary;
    private LocalDate hireDay;
    private int id;

    // Be careful working with static fields and methods with threats, study it in chapter 12
    private static int nextId = 1;

    // constructor
    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }


    public String getname(){
        return name;
    }

    public Double getSalary(){
        return salary;
    }


    public LocalDate getHireDay(){
        return hireDay;
    }


    public void raiseSalary(double byPercent){
        double raise = this.salary * byPercent / 100;
        this.salary += raise;
    }

    public void setId(){
        id = nextId;
        nextId++;
    }

    /*
        Use Static Methods in two situations:

        1 - When a method doesn't need to access the object
            state because all needed parameters are supplied as explicit parameters (example: Math.pow)

        2 - When a method only need to access static fields of the class (Example: Employee.getNextId).

     */
    public static int getNextId(){
        return nextId;
    }

    public int getId(){
        return this.id;
    }



    // Testing method parameters type
    public static void tripleSalaryObject(Employee x){
        x.raiseSalary(200);
    }

    public static void tripleSalary(Double percent){
        percent = 3 * percent;
    }

}
