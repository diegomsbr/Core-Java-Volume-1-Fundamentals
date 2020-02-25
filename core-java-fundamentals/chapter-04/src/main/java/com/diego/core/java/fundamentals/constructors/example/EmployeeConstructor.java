package com.diego.core.java.fundamentals.constructors.example;

import java.util.Random;

public class EmployeeConstructor {
    private static int nextId;

    private int id;
    private String name = ""; // instance field initialization
    private double salary;

    // static initialization block
    static {
        Random random = new Random();
        // set nextId to a random number between 0 and 9999
        nextId = random.nextInt(10000);
    }

    // Object initialization block
    {
        id = nextId;
        nextId ++;
    }

    // Three overloaded constructors
    public EmployeeConstructor(String n, double s){
        name = n;
        salary = s;
    }

    public EmployeeConstructor(double s){
        // calls the EmployeeConstrucotr(String n, double s)
        this("EmployeeConstructor #" + nextId,s);
    }

    // the default constructor
    public EmployeeConstructor(){
        // name initialized tp "" -- see above
        // salary not explicity set --initialized tp 0
        // id initialized in initialization block
     }

     public String getName(){
        return this.name;
     }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }
}
