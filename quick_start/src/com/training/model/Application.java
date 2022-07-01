package com.training.model;

import com.training.exceptions.RangeCheckException;

import java.util.Scanner;

public class Application {

    public static void print(Student obj){

        System.out.println("Roll Number :="+obj.getRollNumber());
        System.out.println("First Name:="+obj.getFirstName());
        System.out.println("Mark Scored:="+obj.getMarkScored());

    }


    public static void main(String[] args) {

        Student ram = new Student();
        print(ram);

        Student shyam = new Student(101,"Shyam",90);
        print(shyam);

        Student siva = null;
        try {
            siva = new Student(101,"Siva");
        } catch (RangeCheckException e) {
            throw new RuntimeException(e);
        }
        print(siva);


        try(Scanner sc = new Scanner(System.in)){

            System.out.println("Enter the Roll Number");
            int rollNumber = sc.nextInt();
            System.out.println("First Name");
            String firstName = sc.next();
            System.out.println("Enter the Mark Scored");
            double markScored = sc.nextDouble();

            Student jaya = new Student();
             jaya.setRollNumber(rollNumber);
             jaya.setFirstName(firstName);
            jaya.setMarkScored(markScored);


        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}
