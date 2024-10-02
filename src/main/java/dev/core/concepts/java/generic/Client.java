package dev.core.concepts.java.generic;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        PairGeneric<Integer,String> pair1 = new PairGeneric(1,"sunil");

        System.out.println(pair1.getFirst() + " --- " +pair1.getSecond() );

        PairGeneric<Integer,String> pair2 = new PairGeneric(1,"2");

        System.out.println(pair2.getFirst() + " --- " +pair2.getSecond() );

        PairGeneric<Double, Double> doubleParam = new PairGeneric<>();

        System.out.println(doubleParam.getFirst() + " --- " + doubleParam.getSecond() );

        //pair1.doSomeThing("Best");

        pair1.printMoreFirst(List.of(1,2,3,4));

        PairGeneric<Animal, Integer> animalCouts = new PairGeneric<>(new Animal(),4);

        Animal a1 = new Animal();

        a1.name = "doggy";
        Animal a2 = new Animal();
        a2.name = "cat";

        animalCouts.printMoreFirst(List.of(a1,a2));

        Dog a3 = new Dog();
        a3.name = "bull dog";

        animalCouts.printMoreFirst(List.of(a3,a2,a1));

        Dog d1 = new Dog();
        d1.name = "dog1";


        Dog d2 = new Dog();
        d2.name = "dog2";

        Dog d3 = new Dog();
        d3.name = "dog3";

        List<Dog> listDogs = new ArrayList<>();
        listDogs.add(d1);
        listDogs.add(d2);
        listDogs.add(d3);
        // dog is of List<Dog>

        // animla count .first is of animal data type
        //animalCount.printmorefirst -- list of animals
        // can i pass dogs to printmoreFirst

        animalCouts.printMoreFirstAgain(listDogs);

        animalCouts.printMoreFirstAgain(List.of(a1,a2,a3));

        List<Dog> l1 = listDogs;
        List<? extends Animal> l2 = l1;

        

    }
}
