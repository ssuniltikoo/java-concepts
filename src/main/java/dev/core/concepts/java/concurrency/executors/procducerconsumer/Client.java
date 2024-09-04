package dev.core.concepts.java.concurrency.executors.procducerconsumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {

        Store   store = new Store(5 );

        ExecutorService es = Executors.newCachedThreadPool();

        for(int i =0; i <= 1; i++){

            Producer p = new Producer(store);
            es.execute(p);

        }

        for(int i =0; i <= 5; i++){
            Consumer c = new Consumer(store);
            es.execute(c);
        }


    }
}
