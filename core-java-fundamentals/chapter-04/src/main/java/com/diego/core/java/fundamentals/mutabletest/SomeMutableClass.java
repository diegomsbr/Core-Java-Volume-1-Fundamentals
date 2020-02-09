package com.diego.core.java.fundamentals.mutabletest;

import java.util.Date;

public class SomeMutableClass {

    private String name;
    private Date date;
    private Date dateWithClone;

    public SomeMutableClass(String name, Date date, Date dateWithClone) {
        this.name = name;
        this.date = date;
        this.dateWithClone = dateWithClone;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    public Date getDateWithClone(){
        return (Date) dateWithClone.clone();
    }
}
