package org.example.model;

public class Universe {

    private static Universe universe;
    private Universe() {
        System.out.println("universe is created");
    }
    public static synchronized Universe getUniverse() {
        if(universe == null) {
            universe = new Universe();
        }

        return universe;
    }
}
