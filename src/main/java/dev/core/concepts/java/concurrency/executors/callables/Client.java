package dev.core.concepts.java.concurrency.executors.callables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Integer[] a = {8,7,3,12,4,15,1,10,50,20,89};
        List<Integer> listOfNumbers = new ArrayList<>(Arrays.asList(a));

        System.out.println(listOfNumbers);

        ExecutorService executorService = Executors.newFixedThreadPool(1);

        GreaterNumber greaterNumber = new GreaterNumber(listOfNumbers);

        Future<Long> futureCount = executorService.submit(greaterNumber);
        System.out.println(futureCount.get());



    }
}
