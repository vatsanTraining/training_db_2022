package com.example.services;
import com.example.model.Employee;

import java.util.*;

public class EmployeeService {


    public void print(Collection<Employee> employeeList){

        for (Employee eachEmployee:employeeList) {
            System.out.println(eachEmployee);
        }

    }

    public void usingArrayList(){

        List<Employee>  employeeList =
                new ArrayList<>();

        employeeList.add(new Employee(101,"Ramesh",56000));
        employeeList.add(new Employee(102,"Anand",76000));
        employeeList.add(new Employee(103,"Magesh",36000));
        employeeList.add(new Employee(104,"Zahir",76000));

        Collections.sort(employeeList);

        print(employeeList);
           //Zero based index hence get(2) instead of get(3)
        System.out.println("Element in Third Position:="+employeeList.get(2));

    }

    public void usingHashSet(){

        Set<Employee> employeeList =
                new HashSet<>();

        employeeList.add(new Employee(101,"Ramesh",56000));
        employeeList.add(new Employee(102,"Anand",76000));
        employeeList.add(new Employee(103,"Magesh",36000));
        employeeList.add(new Employee(104,"Zahir",76000));
        employeeList.add(new Employee(104,"Zahir",76000));
        employeeList.add(new Employee(104,"Zahir Abbas",86000));


         print(employeeList);



    }

    public void usingTreeSet(){

        Set<Employee> employeeList =
                new TreeSet<>();

        employeeList.add(new Employee(101,"Ramesh",56000));
        employeeList.add(new Employee(102,"Anand",76000));
        employeeList.add(new Employee(103,"Magesh",36000));
        employeeList.add(new Employee(104,"Zahir",76000));
        employeeList.add(new Employee(104,"Zahir",76000));


        print(employeeList);



    }

    public void usingHashMap(){


        Map<Integer,Employee> employeeList =
                new HashMap();

        System.out.println(employeeList.put(1,new Employee(101,"Ramesh",56000)));
        employeeList.put(2,new Employee(102,"Anand",76000));
        employeeList.put(3,new Employee(103,"Magesh",36000));
        employeeList.put(4,new Employee(104,"Zahir",76000));
        System.out.println(employeeList.put(4,new Employee(104,"Zahir Abbas",96000)));

        System.out.println(employeeList.get(4));

           Set<Integer> keySet =      employeeList.keySet();

        for (Integer idx:keySet) {
            System.out.println(employeeList.get(idx));
        }
    }

}
