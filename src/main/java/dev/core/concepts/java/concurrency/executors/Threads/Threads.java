package dev.core.concepts.java.concurrency.executors.Threads;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Threads{

    public static void main(String[] args) {
        System.out.println("hello from "+ Thread.currentThread().getName());
        long start = System.currentTimeMillis();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for(int i =1; i < 10; i++){

            FormatPrinter formatPrinter = new FormatPrinter(i);
            executorService.submit(formatPrinter);
        }
//
//        for(int i =1; i < 100000; i++){
//            NumberPrinter numberPrinter = new NumberPrinter(i);
//            executorService.submit(numberPrinter);
//
//        }
        long end = System.currentTimeMillis();
//        try {
//            executorService.wait();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        System.out.println("total time taken by process in seconds is  "+ (end-start)/1000);
        //executorService.submit();


    }

}