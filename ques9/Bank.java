package com.knoldus.kup.Core_Java.ques9;

import com.knoldus.kup.Core_Java.Printer;
//We have defined a class as Printer and a static method print() inside the class to print.

//creating a an abstract class as Bank
public abstract class Bank {
    public String name;
    public String branch;
    public double rateOfInterest;
    public abstract void getDetails();
}
class SBI extends Bank {
    public String name;
    public String branch;
    public double rateOfInterest;
    SBI(String name, String branch, double rateOfInterest)
    {
        this.name = name;
        this.branch = branch;
        this.rateOfInterest= rateOfInterest;
    }
    @Override
    public void getDetails() {
        Printer.print("Bank Name: "+name+"\nBranch: "+branch+"\nRate of Interest: "+rateOfInterest);
    }
}
class BOI extends Bank{
    BOI(String name, String branch, double rateOfInterest)
    {
        this.name = name;
        this.branch = branch;
        this.rateOfInterest= rateOfInterest;
    }
    public String name;
    public String branch;
    public double rateOfInterest;
    @Override
    public void getDetails() {
        Printer.print("Bank Name: "+name+"\nBranch: "+branch+"\nRate of Interest: "+rateOfInterest);
    }
}
class ICICI extends Bank{
    public String name;
    public String branch;
    public double rateOfInterest;

    ICICI(String name, String branch, double rateOfInterest)
    {
        this.name = name;
        this.branch = branch;
        this.rateOfInterest= rateOfInterest;
    }

    @Override
    public void getDetails() {
        Printer.print("Bank Name: "+name+"\nBranch: "+branch+"\nRate of Interest: "+rateOfInterest);
    }
}
class Main{
    public static void main(String[] args) {
        Bank sbi = new SBI("State Bank of India","Roorkee", 23.34);
        Bank boi =new BOI("Bank of India", "Bhagwanpur", 10.34);
        Bank icic =new ICICI("ICICI Bank","Dehradun", 12.33);

        sbi.getDetails();
        boi.getDetails();
        icic.getDetails();
    }
}

