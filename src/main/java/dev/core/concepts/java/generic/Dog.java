package dev.core.concepts.java.generic;

public class Dog extends Animal {
    int height = 6;

    @Override
    public String toString() {
        return "Dog{" +
                "weight=" + weight +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", height=" + height +
                '}';
    }
}
