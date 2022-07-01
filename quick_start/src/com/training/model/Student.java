package com.training.model;

import com.training.exceptions.RangeCheckException;
import org.w3c.dom.ranges.Range;

public class Student {

    private int rollNumber;
    private String firstName;
    private double markScored;


    public Student() {

        this(999,"guest",99);
    }

    public Student(int rollNumber, String firstName) throws RangeCheckException{

        this(rollNumber,firstName,99);
        if(rollNumber >9999){
            throw new RangeCheckException("ERR-103","Roll Number should less than 9999");
        } else {
            this.rollNumber = rollNumber;

        }
               this.firstName = firstName;
    }

    public Student(int rollNumber, String firstName, double markScored)   {

         this.rollNumber = rollNumber;
        this.firstName = firstName;

        try {
            if(markScored<0 || markScored>100){
                throw new RangeCheckException("ERR-102","markScored should be a positive integer in the range 1-100");

            } else {
                this.markScored = markScored;
            }
        } catch (RangeCheckException e) {
            System.err.println(e.getMessage());
        }

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

    public void setMarkScored(double markScored) throws RangeCheckException{

        if(markScored<0 || markScored>100){
            throw new RangeCheckException("ERR-102","markScored should be a positive integer in the range 1-100");

        } else {
            this.markScored = markScored;
        }
    }
}
