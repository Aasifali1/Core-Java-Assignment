package com.knoldus.kup.Core_Java.ques1;

import com.knoldus.kup.Core_Java.Printer;
//We have defined a class as Printer and a static method print() inside the class to print.

public class CheckPop {
//    we have declared check() method as static to call this direct from class name.
    public static boolean check(String str){
        for (int i =0; i<str.length()-2; i++)
        {
            if (str.charAt(i)=='p' && str.charAt(i+2) == 'p')
            {
                return true;
            }
        }
        return  false;
    }
    public static void main(String[] args) {
        //We have defined a class as Printer and a static method print() inside the class to print.
        Printer.print(CheckPop.check("hipop"));
        Printer.print(CheckPop.check("lolipop"));
        Printer.print(CheckPop.check("puptop"));
        Printer.print(CheckPop.check("hellopoppy"));
        Printer.print(CheckPop.check("hellopuuppy"));

    }
}
