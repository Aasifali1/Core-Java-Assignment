package com.knoldus.kup.Core_Java.ques8;

import com.knoldus.kup.Core_Java.Printer;
//We have defined a class as Printer and a static method print() inside the class to print.

public class StaticBlock {
    private static String firstName;
    private static String lastName;
    private static int age;

    static
    {
        firstName ="Aasif";
        lastName = "Ali";
        age     = 23;
    }
    public static void printDetails()
    {
        Printer.print("First Name: "+firstName+"\nLast Name: "+lastName+"\nAge: "+age);
    }

    public static void main(String[] args) {
        StaticBlock.printDetails();
    }
}
