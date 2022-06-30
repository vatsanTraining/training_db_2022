package com.training.model;

import com.training.ifaces.Conditional;

public class Student implements Conditional {

    private String qualification;

    public Student() {
    }

    public Student(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public boolean test() {
        return  qualification.equalsIgnoreCase("ug");

           }

    @Override
    public String toString() {
        return "Student{" +
                "qualification='" + qualification + '\'' +
                '}';
    }
}
