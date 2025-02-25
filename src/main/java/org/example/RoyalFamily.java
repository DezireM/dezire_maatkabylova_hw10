package org.example;

public abstract class RoyalFamily {
    private String name;
    private int age;

    public RoyalFamily(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public abstract void print();
}
