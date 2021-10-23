package com.knoldus.kup.Core_Java.ques20;


import com.knoldus.kup.Core_Java.Printer;
//We have defined a class as Printer and a static method print() inside the class to print.

interface QuackBehavior{
    void quack();
}
interface FlyBehavior{
    void fly();
}

// We are defining each behaviour separately
class CantFly implements FlyBehavior{
    @Override
    public void fly() {
        Printer.print("I can't fly");
    }
}
class FlyFast implements FlyBehavior{
    @Override
    public void fly() {
        Printer.print("flying fastly");
    }
}
class FlySlow implements FlyBehavior{
    @Override
    public void fly() {
        Printer.print("flying slowly");
    }
}
class QuackLoud implements QuackBehavior{
    @Override
    public void quack() {
        Printer.print("quack loudly");
    }
}
class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        Printer.print("squeaking....");
    }
}
class QuackMild implements QuackBehavior{
    @Override
    public void quack() {
        Printer.print("quacking mild.....");
    }
}

// It will represent the type of Duck
enum DuckType{
    RUBBER, MALLARD, REDHEAD
}

//This is the super class of all types of duck classes
abstract class Duck{
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    Duck(){}
   void performFly() {
        this.flyBehavior.fly();
    }
    void performQuack() {
        this.quackBehavior.quack();
    }
    void showDetails(){
       Printer.print("I am duck");
    }
}
class RubberDuck extends Duck{
    RubberDuck(){
        this.flyBehavior =new CantFly();
        this.quackBehavior =new Squeak();
    }

    @Override
    void showDetails() {
        Printer.print("I am "+DuckType.RUBBER+" Duck");
    }
}
class MallardDuck extends Duck{
    MallardDuck()
    {
        this.flyBehavior = new FlyFast();
        this.quackBehavior = new QuackLoud();
    }
    @Override
    void showDetails() {
        Printer.print("I am "+DuckType.MALLARD+" Duck");
    }
}
class ReadheadDuck extends Duck{
    ReadheadDuck()
    {
        this.flyBehavior = new FlySlow();
        this.quackBehavior =new QuackMild();
    }

    @Override
    void showDetails() {
        Printer.print("I am "+DuckType.REDHEAD+" Duck");
    }
}
public class DuckSimulation {
    public static void main(String[] args) {
        Duck md=new MallardDuck();
        md.showDetails();
        md.performFly();
        md.performQuack();

        Printer.print("*****************************");
        Duck rd=new RubberDuck();
        rd.showDetails();
        rd.performFly();
        rd.performQuack();

        Printer.print("*****************************");
        Duck readheadDuck=new ReadheadDuck();
        readheadDuck.showDetails();
        readheadDuck.performFly();
        readheadDuck.performQuack();
    }
}
