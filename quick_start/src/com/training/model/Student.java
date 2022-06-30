package com.training.model;

public class Student {

    private int rollNumber;
    private String firstName;
    private double markScored;


    public Student() {

        this(999,"guest",99);
    }

    public Student(int rollNumber, String firstName) {

        this(rollNumber,firstName,99);
        this.rollNumber = rollNumber;
        this.firstName = firstName;
    }

    public Student(int rollNumber, String firstName, double markScored) {

         this.rollNumber = rollNumber;
        this.firstName = firstName;
        this.markScored = markScored;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public double getMarkScored() {
        return markScored;
    }

    public void setMarkScored(double markScored) {
        this.markScored = markScored;
    }
}
