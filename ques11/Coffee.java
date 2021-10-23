package com.knoldus.kup.Core_Java.ques11;

public class Coffee {
    int id;
    String name;
    int cost;
    Coffee(int id, String name, int cost){
        this.id = id;
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
