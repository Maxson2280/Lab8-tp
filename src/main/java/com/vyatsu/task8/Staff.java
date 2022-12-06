package com.vyatsu.task8;

public class Staff {
    public String name;
    public int age;
    public int money;

    public Staff(String name, int age, int money) {
        this.name = name;
        this.age = age;
        this.money = money;
    }

    public int getMoney(){
        return this.money;
    }
    public int getAge(){
        return this.age;
    }
}
