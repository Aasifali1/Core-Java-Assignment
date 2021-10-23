package com.knoldus.kup.Core_Java.ques18.part3;

import com.knoldus.kup.Core_Java.Printer;
//We have defined a class as Printer and a static method print() inside the class to print.

public interface Vehicle {
    static void display(String name) {
        Printer.print("Vehicle details:");
    }
    default void run(){
        Printer.print("Vehicle is running");
    }
}
interface VehicleTest{
    public default void run(){
        Printer.print("From Vehicle Test Interface");
    }
}

class Bike implements Vehicle, VehicleTest{
    String name;
    Bike(String name){
        this.name = name;
    }
    @Override
    public void run() {
        Printer.print("Bike is running.... from Vehicle interface");
        Printer.print("Bike is running.... from VehicleTest interface");
    }

    public static void display(String name){
        Printer.print("Bike name : "+name);
    }
}
