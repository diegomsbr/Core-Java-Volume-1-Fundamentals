package com.diego.core.java.fundamentals.simpleclass;


import java.time.LocalDate;

public class EmployeeTest {

    public static void main (String args[]){

        // Fill the staff array with three employee objects
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Carl Cracker", 75000D,1987,12,15);
        staff[1] = new Employee("Harry Hacker", 50000D,1989,10,01);
        staff[2] = new Employee("Tony Tester", 40000D,1990,3,5);

        System.out.println("Static method Employee.getNextId() = " + Employee.getNextId());

        // raise everyone salary by 5% and setId
        for (Employee e: staff){
            e.raiseSalary(5);
            e.setId();
            System.out.println("Static method Employee.getNextId() = " + Employee.getNextId());
        }

        // print out information about all employees objects
        for (Employee e : staff){
            System.out.println("name=" + e.getname() + ",salary=" + e.getSalary() + ",hireDay=" + e.getHireDay() + ", id=" + e.getId());
        }

        // Testing mutable field
        System.out.println();
        System.out.println("testing if a field can be mutable");
        System.out.println();

        System.out.println("Before = " + staff[0].getname());
        String name = staff[0].getname();
        name = "Diego";

        System.out.println("After  = " + staff[0].getname());

        System.out.println("Before = " + staff[0].getSalary());
        Double salary = staff[0].getSalary();
        salary = 1000000D;

        System.out.println("After  = " + staff[0].getSalary());

        System.out.println("Before = " + staff[0].getHireDay());
        LocalDate d = staff[0].getHireDay();
        d = LocalDate.now();
        System.out.println("After  = " + staff[0].getHireDay());

        // Testing Method parameters
        // Primitive Types will not changed (Numbers, Booleans)
        System.out.println();
        double percent = 10D;
        System.out.println("Testing if variable was changed (before) = " + percent);

        Employee.tripleSalary(percent);

        System.out.println("Testing if variable was changed (after)  = " + percent);

        // Objects reference will be changed !!!
        // Because the copy is a object reference ! The Method receives the copy, but the both copy
        // and original refer to the same object !
        //
        System.out.println();
        System.out.println("Testing if variable was changed (before) = " + staff[0].getSalary());

        Employee.tripleSalaryObject(staff[0]);

        System.out.println("Testing if variable was changed (after)  = " + + staff[0].getSalary());

    }
}
