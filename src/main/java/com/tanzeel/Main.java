package com.tanzeel;

public class Main {
    public static void main(String[] args) {
        DogDoor dogDoor = new DogDoor();
        Remote remote = new Remote(dogDoor);
        System.out.println("Dog is barking");
        remote.pressButton();
        System.out.println("The dog went outside");
        remote.pressButton();
        System.out.println("Dog is all done");
        remote.pressButton();
        System.out.println("Dog is inside");
        remote.pressButton();
    }
}