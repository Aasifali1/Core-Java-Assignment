package com.knoldus.kup.Core_Java.ques5;

import com.knoldus.kup.Core_Java.Printer;
//We have defined a class as Printer and a static method print() inside the class to print.

public class FirstFactorial {
    public int factorial(int num)
    {
        int fact = num;
        if(num <=0){return 1;}
        for (int i=1; i<num; i++)
        {
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        FirstFactorial f=new FirstFactorial();
        Printer.print(f.factorial(5));
    }
}
