package com.knoldus.kup.Core_Java.ques3;

import com.knoldus.kup.Core_Java.Printer;
//We have defined a class as Printer and a static method print() inside the class to print.


public class RemoveCharecter {
    public String remove(String str, char c)
    {
        String newStr = "";
        for (int i =0; i<str.length();i++)
        {
            if(str.charAt(i)==c)
            {
                continue;
            }
            else {
                newStr += String.valueOf(str.charAt(i));
            }
        }
       return newStr;
    }
    public static void main(String[] args) {
        RemoveCharecter rm=new RemoveCharecter();
       String str = "HelloGood eveningfmmf gfgf";
      Printer.print(rm.remove("abcdefabcdeabcdaaa", 'a'));;
    }
}
