package dev.core.concepts.java.concurrency.executors.mergesort;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class MergeSort {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> listOfIntegers = Arrays.asList(9,8,9,7,6,5,4,1,4,3,1,10,15,20,2,3,100,1000,10000,120,12089,1085,1086,1087,1088,1099,1020,2040,2060,3000,3001,3002);

        ExecutorService executorService = Executors.newCachedThreadPool() ;// Executors.newFixedThreadPool(3);

      //  ExecutorService executorService =  Executors.newFixedThreadPool(2);

        Sorter sort = new Sorter(listOfIntegers,executorService);
        Future<List<Integer>> futures = executorService.submit(sort);

        System.out.println(futures.get());

        System.out.println("main");


    }
}
