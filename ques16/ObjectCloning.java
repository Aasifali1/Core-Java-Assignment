package com.knoldus.kup.Core_Java.ques16;

import com.knoldus.kup.Core_Java.Printer;
//We have defined a class as Printer and a static method print() inside the class to print.

public class ObjectCloning implements Cloneable{
    int id;
    String name;

    ObjectCloning(int id, String name)
    {
        this.id= id;
        this.name = name;
    }
//    Creating copy constructor
    ObjectCloning(ObjectCloning objectCloning){
        this.id = objectCloning.id;
        this.name = objectCloning.name;
    }
    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException{
        ObjectCloning obj1 =new ObjectCloning(11,"Aasif");
//        By using clone method
        Printer.print("***********By using clone method*************");
        ObjectCloning obj2 = (ObjectCloning) obj1.clone();
        Printer.print("Id: "+obj1.id+"\nName: "+obj1.name);
        Printer.print("Id: "+obj2.id+"\nName: "+obj2.name);

//        By using copy constructor
        Printer.print("***********By Using Copy Constructor**********");
        ObjectCloning copyObj = new ObjectCloning(obj1);
        Printer.print("Id: "+copyObj.id+"\nName: "+copyObj.name);
    }
}
