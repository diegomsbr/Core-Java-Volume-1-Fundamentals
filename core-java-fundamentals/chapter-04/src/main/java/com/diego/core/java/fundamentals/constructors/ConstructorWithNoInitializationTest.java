package com.diego.core.java.fundamentals.constructors;

public class ConstructorWithNoInitializationTest {

    public static void main (String args[]){

        ConstructorWithNoInitialization constructorWithNoInitialization = new ConstructorWithNoInitialization();

        // If we do not initialize the class variables in a custom constructor
        // Java will initialize by default, which is:
        // Numeric to 0
        // Boolean to false
        // Objects to null

        System.out.println("constructorWithNoInitialization.getNumberDouble = " + constructorWithNoInitialization.getNumberDouble());
        System.out.println("constructorWithNoInitialization.getNumberInt() = " + constructorWithNoInitialization.getNumberInt());
        System.out.println("constructorWithNoInitialization.getNumberLong() = " + constructorWithNoInitialization.getNumberLong());
        System.out.println("constructorWithNoInitialization.getNumblerFloat()) = " + constructorWithNoInitialization.getNumblerFloat());
        System.out.println("constructorWithNoInitialization.isSomeBoolean()) = " + constructorWithNoInitialization.isSomeBoolean());
        System.out.println("constructorWithNoInitialization.getSomeObject()) = " + constructorWithNoInitialization.getSomeObject());

    }
}
