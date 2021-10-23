package com.knoldus.kup.Core_Java.ques21;

import com.knoldus.kup.Core_Java.Printer;
//We have defined a class as Printer and a static method print() inside the class to print.

import java.util.Scanner;

//Creating an employee
public class Employee {
    private int empId;
    private String empName, empDesignation;
    Employee(int empId, String empName, String empDestination){
        this.empId = empId;
        this.empName = empName;
        this.empDesignation = empDestination;
    }
    void setEmpId(int empId){
        this.empId =empId;
    }
    void setEmpName(String name){
        this.empName =empName;
    }
    void setEmpDesignation (String empDesignation){
        this.empDesignation =empDesignation;
    }
    int getEmpId(){
        return this.empId;
    }
    String getEmpName(){
        return this.empName;
    }
    String getEmpDesignation(){
        return this.empDesignation;
    }
}


class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Printer.print("Enter number of employees");
        int num = sc.nextInt();
//        creating array of employees
        Employee[] employee=new Employee[num];
        for (int i=0; i<num; i++){
            Printer.print("Enter Employee id");
            int id = sc.nextInt();
            Printer.print("Enter Employee Name");
            String name = sc.next();
            Printer.print("Enter Employee Designation");
            String designation = sc.next();
            employee[i] = new Employee(id,name,designation);
        }
//        printing all the employees
        for (Employee emp:employee) {
            Printer.print("Employee ID: "+emp.getEmpId()+"\nEmployee Name: "+emp.getEmpName()+"\nDesignation: "+emp.getEmpDesignation());
        }

    }
}
