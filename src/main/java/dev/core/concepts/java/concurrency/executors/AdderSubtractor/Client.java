package dev.core.concepts.java.concurrency.executors.AdderSubtractor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(2);
       // ExecutorService es = Executors.newCachedThreadPool();
        Value val = new Value();

        Adder adder = new Adder(val);
        Subtractor subtractor = new Subtractor(val);
        Future<Void> futureAdder = es.submit(adder);
        Future<Void> futureSubtractor = es.submit(subtractor);


        futureSubtractor.get();
        futureAdder.get();
        System.out.println(val.num);



    }
}
