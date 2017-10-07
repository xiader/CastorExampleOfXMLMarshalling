package com.sasha;

public class Person {
    public String name;
    public int age;
    public int weight;
    public int height;
        public Wallet wallet;


    public Person() {
    }

    public Person(String name, int age, int weight, int height, Wallet wallet) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.wallet = wallet;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                ", wallet=" + wallet +
                '}';
    }
}