package dev.core.concepts.java.generic;


public class PairGeneric <A,B>{
    A first;
    B second;

    public PairGeneric(A first, B second) {
        this.first = first;
        this.second = second;
    }
//
//    public void setFirst(A first) {
//        this.first = first;
//    }
//
//    public void setSecond(B second) {
//        this.second = second;
//    }

    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }
}
