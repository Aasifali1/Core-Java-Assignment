package com.knoldus.kup.Core_Java.ques22;

import com.knoldus.kup.Core_Java.Printer;
//We have defined a class as Printer and a static method print() inside the class to print.

import java.util.Scanner;

public class CheckDigit {
//    sumDoubleeven() will return the integer after double the value by multiplying with 2.
    public static int sumDoubleeven(long checkNum) {
        int sum = 0;
        String num = checkNum + "";
        for (int i = num.length() - 2; i >= 0; i -= 2) {
            sum += getDigit(Integer.parseInt(num.charAt(i) + "") * 2);
        }
        return sum;
    }

    public static int getDigit(int checkNum) {
        if (checkNum < 9)
            return checkNum;
        return checkNum / 10 + checkNum % 10;
    }

    public static int sumodd(long checkNum) {
        int sum = 0;
        String num = checkNum + "";
        for (int i = num.length() - 1; i >= 0; i -= 2)
            sum += Integer.parseInt(num.charAt(i) + "");
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Printer.print("Enter digits");
        String in = scanner.next();
        long num = Long.parseLong(in);
        Printer.print(sumDoubleeven(num) + sumodd(num));
        if((sumDoubleeven(num) + sumodd(num)) % 10==0){
            Printer.print("Okay");
        }else {
            Printer.print("Not Okay");
        }
        System.out.println();
//        4012888888881881
    }

}
