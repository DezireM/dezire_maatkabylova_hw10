package org.example;

import javax.xml.namespace.QName;

public class King extends RoyalFamily implements Printable{
    private int reignYears;

    public King(String name, int age, int reignYears) {
        super(name, age);
        this.reignYears = reignYears;
    }

    @Override
    public void print() {
        System.out.println("King: \uD83D\uDC51");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Reign Years: " + reignYears);

    }
}
