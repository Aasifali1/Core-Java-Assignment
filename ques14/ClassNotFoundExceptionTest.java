package com.knoldus.kup.Core_Java.ques14;

import com.knoldus.kup.Core_Java.Printer;

public class ClassNotFoundExceptionTest {
    public static void main(String[] args) {
        try {
//            To produce ClassNotFoundException
            Class.forName("com.knoldus.kup.Core_Java.ques14.Hello");
        }catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }
        Printer.print("After exception occur rest of the code");
    }
}
