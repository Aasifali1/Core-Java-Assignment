package com.knoldus.kup.Core_Java.ques10;

import com.knoldus.kup.Core_Java.Printer;
//We have defined a class as Printer and a static method print() inside the class to print.

import java.util.Scanner;

public class WordsReader {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word;
        do {
            word = sc.next();
            if (word.charAt(0) == word.charAt(word.length()-1))
            {
                Printer.print("First and last character is same: "+word);
            }
        }
        while (!word.equals("done"));
    }
}
