package com.diego.core.java.fundamentals.explictFieldInitialization;

public class EmployeeWithExplictFieldInitialization {

    private static int nextId = 1;
    private int id = assignId();

    private static int assignId(){
        int r = nextId;
        nextId++;
        return r;
    }

    public int getId() {
        return id;
    }
}
