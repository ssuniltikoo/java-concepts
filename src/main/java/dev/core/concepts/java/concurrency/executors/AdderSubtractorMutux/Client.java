package dev.core.concepts.java.concurrency.executors.AdderSubtractorMutux;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
       // ExecutorService es = Executors.newFixedThreadPool(2);
        ExecutorService es = Executors.newCachedThreadPool();
        Value val = new Value();
        Lock lock = new ReentrantLock(); // mutux
        Adder adder = new Adder(val,lock);
        Subtractor subtractor = new Subtractor(val,lock);
        Future<Void> futureAdder = es.submit(adder);
        Future<Void> futureSubtractor = es.submit(subtractor);


        futureSubtractor.get();
        futureAdder.get();
        System.out.println("FINAL VALUE" + val.num);



    }
}
