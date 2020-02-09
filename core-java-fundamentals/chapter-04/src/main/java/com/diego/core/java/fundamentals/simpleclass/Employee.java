package com.diego.core.java.fundamentals.simpleclass;

import java.time.LocalDate;
import java.util.Date;

public class Employee {

    private String name;
    private double salary;
    private LocalDate hireDay;
    private int id;
    private static int nextId = 1; // Be carefull working with threats, study it in chapter 12

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

    public int getId(){
        return this.id;
    }

}
