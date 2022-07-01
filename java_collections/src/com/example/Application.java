package com.example;

import com.example.services.EmployeeService;

public class Application {

    public static void main(String[] args) {

        EmployeeService service =
                 new EmployeeService();

        //service.usingArrayList();
       // service.usingHashSet();
      //  service.usingTreeSet();
        service.usingHashMap();
    }


}
