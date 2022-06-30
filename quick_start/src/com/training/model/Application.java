package com.training.model;

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

        Student siva = new Student(101,"Siva");
        print(siva);



    }
}
