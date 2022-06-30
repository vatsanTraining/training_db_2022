package com.training;

/*
   overload
  autoboxing
   static

 */

import java.util.Scanner;
public class Application {

    public static void main(String[] args) {

        BankAccount ram=
                new BankAccount(1000,"Ramesh",50000);

        System.out.println(ram);

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Account Number");
//        int accountNumber =sc.nextInt();
//
//        System.out.println("Account Holder Name");
//        String accountHolderName = sc.next();
//
//        System.out.println("Enter the Balance");
//        double balance = sc.nextDouble();
//
//
//        BankAccount shyam = new BankAccount(accountNumber,accountHolderName,balance);
//
//        System.out.println(shyam);
//
//        sc.close();

        int accountNumber2= Integer.parseInt(args[0]);
        double balance2= Double.parseDouble(args[2]);
        BankAccount shiv =
                  new BankAccount(accountNumber2,args[1],balance2);

        System.out.println(shiv);

        BankAccount jagan=
                new SavingAccount(8999,"jagan",20000,"abdfd2323","umesh");

        System.out.println(jagan);

    }
}
