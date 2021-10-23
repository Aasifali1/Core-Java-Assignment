package com.knoldus.kup.Core_Java.ques11;

import com.knoldus.kup.Core_Java.Printer;

public class Customer {
    String name,contact;
    Customer(String name, String contact){
        this.name = name;
        this.contact =contact;
    }
    public void waitForCoffee(){
        Printer.print("Wating ........");
    }
    public static void collectCoffee(String msg){
        Printer.print("\n"+msg);
    }
    public void giveOrder(){
        int tokenNo = Cashier.takeOrder();
    }
}
