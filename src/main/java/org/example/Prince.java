package org.example;

public class Prince extends RoyalFamily implements Printable{
    private String title;

    public Prince(String name, int age, String title) {
        super(name, age);
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Prince: \uD83E\uDD34\uD83C\uDFFB ");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Title: " + title);

    }
}
