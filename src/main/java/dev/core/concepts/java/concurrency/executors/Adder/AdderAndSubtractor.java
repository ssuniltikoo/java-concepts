package dev.core.concepts.java.concurrency.executors.Adder;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AdderAndSubtractor {

    public static void main(String[] args) throws InterruptedException {
//        ExecutorService executorService = Executors.newFixedThreadPool(1);
//      NumberClazz num = new NumberClazz();
//        for (int i = 0; i < 5; i++) {
//            executorService.execute(new Adder(num));
//            executorService.execute(new Subtractor(num));
//        }
//
//        try {
//            executorService.wait();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//
//        }

        NumberClazz num = new NumberClazz();

        Adder add = new Adder(num);
        Subtractor subtractor = new Subtractor(num);
        Thread t2 = new Thread(subtractor);
        Thread t1 = new Thread(add);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(num.num);
//        System.out.println(num.num + "  ==> is now value of num from " + Thread.currentThread().getName());

//        ExecutorService executorService = Executors.newFixedThreadPool(2);
//
//        Adder add = new Adder(num);
//        Subtractor subtractor = new Subtractor(num);
//
//        executorService.submit(add);
//        executorService.submit(subtractor);
//
//        System.out.println(num.num + "  ==> is now value of num from " + Thread.currentThread().getName());

    }

}
