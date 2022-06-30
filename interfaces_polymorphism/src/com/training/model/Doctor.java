package com.training.model;

import com.training.ifaces.Conditional;
import com.training.services.MyBusinessService;

public class Doctor extends MyBusinessService implements Conditional {

    private String specialization;

    public Doctor() {
        MyBusinessService service = new MyBusinessService();
        
    }

    public Doctor(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public boolean test() {
        boolean result = false;

        if(specialization.equalsIgnoreCase("ent")){
            result = true;
        }
        return result;

    }

    @Override
    public String toString() {
        return "Doctor{" +
                "specialization='" + specialization + '\'' +
                '}';
    }
}
