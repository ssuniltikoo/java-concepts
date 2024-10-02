package dev.core.concepts.java.generic;


import java.util.ArrayList;
import java.util.List;

public class PairGeneric <A,B>{
   private A first;
   private B second;



    public PairGeneric(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public PairGeneric(){}

    public void setFirst(A first) {
        this.first = first;
    }

    public void setSecond(B second) {
        this.second = second;
    }

    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }

    public void doSomeThing( A greetings){

        System.out.println(greetings);
        System.out.println(first);
        System.out.println(second);
    }

    public void printMoreFirst(List<A> first){
        for(A f : first){
            System.out.println(f);
        }

    }


    public void printMoreFirstAgain(List<? extends A> first){
        for(A f : first){
            System.out.println(f);
        }

    }


}


