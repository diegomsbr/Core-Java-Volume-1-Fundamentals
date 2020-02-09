package com.diego.core.java.fundamentals.simpleclass;

import java.time.LocalDate;
import java.util.Date;

public class Employee {

    // Instance fields -- Be carefull about mutable objects that you have to return!!!
    private String name;
    private double salary;
    private LocalDate hireDay;

    // constructor
    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }

    // WARNING, if we return objects with can be mutable, the data can be updated
    // In these methods, the LocalDate is mutable!!

    public String getname(){
        return name;
    }

    public Double getSalary(){
        return salary;
    }

    // GOOD, LOCAL DATE DOES NOT HAVE A MUTATOR METHOD
     public LocalDate getHireDay(){
        return hireDay;
    }

    // BAD, DATE HAS A MUTATOR OBJECT - setTime
    //public LocalDate getHireDay(){
    //    return hireDay;
    //}
    // GOOD -- As a rule of thumb, always use clone whenever you need to return a copy of a mutable field
    // The example how to do it will be in a chapter 6

    //public Date getHireDay(){
    //    return (Date) hireDay.clone();
    //}

    public void raiseSalary(double byPercent){
        double raise = this.salary * byPercent / 100;
        this.salary += raise;
    }


}
