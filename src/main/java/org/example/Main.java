package org.example;

public class Main {

    public static RoyalFamily createObject(String className) {
        switch (className) {
            case "King":
                return new King("George III", 71, 59);
            case "Queen":
                return new Queen("Victoria", 81, "Prince Albert");
            case "Prince":
                return new Prince("William", 38, "Duke of Cambridge");
            default:
                return null;
        }


    }
    public static void main(String[] args) {
        RoyalFamily object2 = createObject("King");
        RoyalFamily object3 = createObject("Queen");
        RoyalFamily object4 = createObject("Prince");
        RoyalFamily[] objects = {object2, object3, object4};

        for (int i = 0; i < objects.length; i++) {
            objects[i].print();
        }
    }
}