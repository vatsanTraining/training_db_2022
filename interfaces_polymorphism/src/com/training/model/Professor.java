package com.training.model;

import com.training.ifaces.Conditional;

public class Professor implements Conditional {

    private String college;

    public Professor(String college) {
        this.college = college;
    }

    public Professor() {
    }

    @Override
    public boolean test() {
        boolean result = false;

        if(college.equalsIgnoreCase("nit")){
            result = true;
        }
        return result;

    }

    @Override
    public String toString() {
        return "Professor{" +
                "college='" + college + '\'' +
                '}';
    }
}
