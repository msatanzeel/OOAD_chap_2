package com.tanzeel;

public class DogDoor {
    private boolean open;

    public DogDoor(boolean open) {
        this.open = open;
    }

    public DogDoor(){
        this(false);
    }

    public boolean isOpen() {
        return open;
    }

    public void open() {
        System.out.println("The dog door opens");
        open = true;
    }

    public void close() {
        System.out.println("The dog door closes");
        open = false;
    }
}
