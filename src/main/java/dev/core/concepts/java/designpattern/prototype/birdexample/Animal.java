package dev.core.concepts.java.designpattern.prototype.birdexample;

public abstract class Animal {

    private int noOfLegs;
    private Color color;
    private AnimalType animalType;
    public Animal(int noOfLegs, Color color, AnimalType animalType) {}
    public int getNoOfLegs() {
        return noOfLegs;
    }

}
