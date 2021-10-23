package com.knoldus.kup.Core_Java.ques15;

import com.knoldus.kup.Core_Java.Printer;
//We have defined a class as Printer and a static method print() inside the class to print.

public class SingletonClass {
    private static SingletonClass instance = null;
    private String text;

    private SingletonClass(){
        text = "This is singleton class constructor";
    }
    private static SingletonClass getInstance()
    {
        if(instance == null)
        {
            instance = new SingletonClass();
        }
        return instance;
    }

    public static void main(String[] args) {
        SingletonClass instance1 = SingletonClass.getInstance();
        SingletonClass instance2 = SingletonClass.getInstance();
        Printer.print(instance1.text);
        Printer.print(instance1 == instance2); // Output : true , Because both the instances refer to
                                                // same memory location on the heap.
    }
}
