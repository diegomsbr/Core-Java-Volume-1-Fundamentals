package com.diego.core.java.fundamentals.constructors.example;

public class ConstructorTest {

    public static void main (String args[]){

        // fill the staff array with three Employee objects
        EmployeeConstructor staff[] = new EmployeeConstructor[3];

        staff[0] = new EmployeeConstructor("Harry", 40000D);
        staff[1] = new EmployeeConstructor(60000D);
        staff[2] = new EmployeeConstructor();

        // print out information about all Employee objects
        for (EmployeeConstructor e : staff){
            System.out.println("name = " + e.getName() + ", id = " + e.getId() + ",salary = " + e.getSalary());
        }
    }
}
