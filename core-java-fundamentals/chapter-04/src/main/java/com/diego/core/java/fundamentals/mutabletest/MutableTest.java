package com.diego.core.java.fundamentals.mutabletest;

import java.time.Instant;
import java.util.Date;

public class MutableTest {

    public static void main (String args[]){

        SomeMutableClass someMutableClass = new SomeMutableClass("Diego", Date.from(Instant.EPOCH), Date.from(Instant.EPOCH));

        System.out.println(someMutableClass.getName());
        System.out.println(someMutableClass.getDate());

        String test = someMutableClass.getName();
        test.concat("Joao");

        Date d = someMutableClass.getDate();
        double tenYarsInMilliSeconds = 10 * 365.25 * 24 * 60 * 60 * 1000;
        d.setTime(d.getTime() - (long) tenYarsInMilliSeconds);

        System.out.println(someMutableClass.getName());
        System.out.println(someMutableClass.getDate());

        // What happened?
        // Date has a mutator method setTime, and when we receive it from the class, we can change the value
        // to correct it, we need to return a clone to avoid it.

        System.out.println();
        System.out.println(someMutableClass.getDateWithClone());

        Date d2 = someMutableClass.getDateWithClone();
        d2.setTime(d2.getTime() - (long) tenYarsInMilliSeconds);

        System.out.println(someMutableClass.getDateWithClone());
    }
}
