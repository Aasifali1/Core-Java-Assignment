package com.knoldus.kup.Core_Java.ques14;

public class NoClassDefFoundErrorTest {
    public static void main(String[] args) {
        try {
//          To produce NoClassDefFoundErrorTest
            Test obj=new Test();
            obj.show();
        }catch (NoClassDefFoundError ex){
            ex.printStackTrace();
        }
    }
}
class Test{
    void show(){
        System.out.print("This class does not exist");
    }
}
