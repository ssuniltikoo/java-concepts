package dev.core.concepts.java.generic;

public class Client {
    public static void main(String[] args) {

        PairGeneric<Integer,String> pair1 = new PairGeneric(1,"sunil");

        PairGeneric<Integer,String> pair2 = new PairGeneric(1,2);

        System.out.println(pair2.second);

    }
}
