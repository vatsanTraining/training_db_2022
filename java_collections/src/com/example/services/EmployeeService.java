package com.example.services;
import com.example.model.Employee;

import java.util.*;

public class EmployeeService {


    public void usingArrayList(){

        List<Employee>  employeeList =
                new ArrayList<>();

        employeeList.add(new Employee(101,"Ramesh",56000));
        employeeList.add(new Employee(102,"Anand",76000));
        employeeList.add(new Employee(103,"Magesh",36000));
        employeeList.add(new Employee(104,"Zahir",76000));

        for (Employee eachEmployee:employeeList) {
            System.out.println(eachEmployee);
        }
           //Zero based index hence get(2) instead of get(3)
        System.out.println("Element in Third Position:="+employeeList.get(2));

    }

}
