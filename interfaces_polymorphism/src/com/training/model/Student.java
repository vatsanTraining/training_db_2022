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
        boolean result = false;

        if(qualification.equalsIgnoreCase("ug")){
            result = true;
        }
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "qualification='" + qualification + '\'' +
                '}';
    }
}
