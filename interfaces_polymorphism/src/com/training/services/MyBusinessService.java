package com.training.services;

import com.training.ifaces.Conditional;
import com.training.model.Doctor;
import com.training.model.Student;

public class MyBusinessService {


    public Conditional  getObject(int key){

        switch (key){
            case 1:
                return new Student("ug");
            case 2:
                return new Doctor("dental");
            default:
                return null;
        }
    }

   public void printResult(Conditional poly){

       System.out.println(poly);
       System.out.println("Result:="+poly.test());
   }

}
