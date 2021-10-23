package com.knoldus.kup.Core_Java.ques17;

import com.knoldus.kup.Core_Java.Printer;
//We have defined a class as Printer and a static method print() inside the class to print.

import java.util.Scanner;

public class TryCatchFinally {
    Scanner scanner = null;
    public void devideBy(int num)
    {
        try {
            scanner = new Scanner(System.in);
            System.out.print("Enter the number of elements");
            //reading the number of elements from the that we want to enter
            int n = scanner.nextInt();
            int[] arr=new int[n];
            System.out.println("Enter the elements of the array: ");
            for(int i=0; i<n; i++)
            {
            //reading array elements
                arr[i]=scanner.nextInt();
            }
            for (int i=0; i<arr.length; i++)
            {
                int result = arr[i] / num;
                Printer.print("res"+result);
            }
        }
        catch (ArithmeticException e)
        {
            Printer.print(e);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            Printer.print(e);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {
            if (scanner != null) {
                scanner.close();
                System.out.println("Scanner closed");
            }
        }
        Printer.print("Exit from the application");
    }
    public static void main(String[] args) {
        TryCatchFinally t=new TryCatchFinally();
        t.devideBy(0);
    }
}
