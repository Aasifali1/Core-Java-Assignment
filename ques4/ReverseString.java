package com.knoldus.kup.Core_Java.ques4;

import com.knoldus.kup.Core_Java.Printer;
//We have defined a class as Printer and a static method print() inside the class to print.

public class ReverseString {

    public static String reverseStr(String str){
        String s="";
        for (int i=str.length()-1; i>=0; i--)
        {
            s += str.charAt(i);
        }
        return s;
    }
    public static void main(String[] args) {
        String str = "Hello";
        Printer.print(ReverseString.reverseStr(str));
    }
}
