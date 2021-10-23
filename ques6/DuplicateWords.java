package com.knoldus.kup.Core_Java.ques6;

import com.knoldus.kup.Core_Java.Printer;
//We have defined a class as Printer and a static method print() inside the class to print.

public class DuplicateWords {
    public static void find(String str)
    {
        str = str.toLowerCase();
        int counter;
        String words[] = str.split(" ");
        for (int i=0; i<words.length; i++) {
            counter = 1;
            for (int j= i+1; j<words.length; j++){
                if(words[i].equals(words[j])) {
                    counter++;
                    words[j] = "0";
                }
            }
            if(counter > 1 && words[i] != "0")
                Printer.print(words[i]+":"+counter);
        }
    }
    public static void main(String[] args) {
        DuplicateWords.find("Hello how are you how where are you Who are you you");
    }
}
