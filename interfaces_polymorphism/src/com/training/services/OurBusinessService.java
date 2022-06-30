package com.training.services;

import com.training.ifaces.Conditional;
import com.training.model.Professor;

public class OurBusinessService extends  MyBusinessService {

    @Override
    public Conditional getObject(int key) {

        if(key==3){
            return new Professor("nit");
        } else {
            return super.getObject(key);
        }
    }
}
