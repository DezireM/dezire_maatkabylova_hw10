package org.example;

public class Queen extends RoyalFamily implements Printable{
    private String consort;

    public Queen(String name, int age, String consort) {
        super(name, age);
        this.consort = consort;
    }

    @Override
    public void print() {
        System.out.println("Queen: \uD83D\uDC78");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Consort: " + consort);

    }
}
