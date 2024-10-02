package dev.core.concepts.java.concurrency.executors.semaphores;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {

        Store store = new Store(5 );

       Semaphore producerSemaphore = new Semaphore(5);
       Semaphore consumerSemaphore = new Semaphore(0);


        ExecutorService es = Executors.newCachedThreadPool();

        for(int i =0; i <= 5; i++){

            Producer p = new Producer(store,producerSemaphore,consumerSemaphore);
            es.execute(p);

        }

        for(int i =0; i <= 8; i++){
            Consumer c = new Consumer(store,producerSemaphore,consumerSemaphore);
            es.execute(c);
        }



//        ExecutorService e = Executors.newFixedThreadPool(2);
//        Producer p = new Producer(store,producerSemaphore,consumerSemaphore);
//        e.submit(p);
//        Consumer c = new Consumer(store,producerSemaphore,consumerSemaphore);
//        e.submit(c);


    }
}
