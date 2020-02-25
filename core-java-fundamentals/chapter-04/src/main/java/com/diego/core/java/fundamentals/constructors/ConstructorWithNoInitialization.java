package com.diego.core.java.fundamentals.constructors;

public class ConstructorWithNoInitialization {

    private int numberInt;
    private double numberDouble;
    private float numblerFloat;
    private long numberLong;
    private SomeObject someObject;
    private boolean someBoolean;

    // If you create your own constructor, and you like to allow the users of you class to
    // instantiate the non argument constructor, you have to define ir:

    public ConstructorWithNoInitialization(){

    }

    // Your own constructor

    public ConstructorWithNoInitialization(int numberInt, double numberDouble, float numblerFloat, long numberLong, SomeObject someObject, boolean someBoolean) {
        this.numberInt = numberInt;
        this.numberDouble = numberDouble;
        this.numblerFloat = numblerFloat;
        this.numberLong = numberLong;
        this.someObject = someObject;
        this.someBoolean = someBoolean;
    }

    public int getNumberInt() {
        return numberInt;
    }

    public double getNumberDouble() {
        return numberDouble;
    }

    public float getNumblerFloat() {
        return numblerFloat;
    }

    public long getNumberLong() {
        return numberLong;
    }

    public SomeObject getSomeObject() {
        return someObject;
    }

    public boolean isSomeBoolean() {
        return someBoolean;
    }
}
