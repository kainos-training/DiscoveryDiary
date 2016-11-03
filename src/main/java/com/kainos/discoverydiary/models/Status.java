package com.kainos.discoverydiary.models;

/**
 * Created by seano on 03/11/2016.
 */
public enum Status {

    AVAILABLE ("Available"),
    ON_LOAN ("On Loan"),
    IN_DISREPAIR("In Disrepair");

    private final String name;

    private Status(String name) {
        this.name = name;
    }

    public boolean equalsName(String otherName) {
        return (otherName == null) ? false : name.equals(otherName);
    }

    public String toString() {
        return this.name;
    }



}
