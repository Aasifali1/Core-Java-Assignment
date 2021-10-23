package com.knoldus.kup.Core_Java.ques13;

public class Student implements User{
    String name,studentCalss;
    int studentId;
    Student(int studentId, String name, String studentCalss){
        this.studentId = studentId;
        this.name = name;
        this.studentCalss = studentCalss;
    }

    @Override
    public void add() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void update() {

    }
}
