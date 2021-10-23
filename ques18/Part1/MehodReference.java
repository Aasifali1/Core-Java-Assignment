package com.knoldus.kup.Core_Java.ques18.Part1;

import com.knoldus.kup.Core_Java.Printer;
//We have defined a class as Printer and a static method print() inside the class to print.

interface Addition{
    int add(int num1, int num2);
}
interface Subtration{
    int subtract(int num1, int num2);
}

@FunctionalInterface
interface Multiplication{
   abstract int multiply(int num1, int num2);
}

class InstanceReference{
    public int add(int num1, int num2){
        return num1 + num2;
    }
    public int subtraction(int num1, int num2){
        return num1 + num2;
    }
}
class StaticReference{
    static int multiplication(int num1, int num2){
        return num1 * num2;
    }
}

class MehodReference {
    public static void main(String[] args) {
        InstanceReference instanceReference = new InstanceReference();
        Addition add = instanceReference::add;
        Printer.print("Additon : "+add.add(4,5));

        Subtration sub = instanceReference::subtraction;
        Printer.print("Subtraction : "+sub.subtract(41,2));

        Multiplication mul = StaticReference::multiplication;
        Printer.print("Multiplication : "+mul.multiply(5,4));
    }
}
