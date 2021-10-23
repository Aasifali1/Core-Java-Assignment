package com.knoldus.kup.Core_Java.ques7;

import com.knoldus.kup.Core_Java.Printer;
//We have defined a class as Printer and a static method print() inside the class to print.

public class DuplicateCharacter {
    public static int findChar(String str, char c){
        int  count =0;
        str = str.toLowerCase();
        if(str.length()<1) { return 0; }
        if(str.charAt(0) == c) {
            count++;
        }
        count += findChar(str.substring(1), c);
        return count;
    }
    public static void main(String[] args) {
        String str= "helloll";
        char c = 'l';
        Printer.print( DuplicateCharacter.findChar(str, c));
    }
}
