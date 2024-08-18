package dev.core.concepts.java.concurrency.executors.callables;

import java.util.List;
import java.util.concurrent.Callable;

public class GreaterNumber implements Callable<Long> {
    List<Integer> listOfNumbers;

    public GreaterNumber(final List<Integer> listOfNumbers){
        this.listOfNumbers = listOfNumbers;
    }

    @Override
    public Long call() throws Exception {
       return  listOfNumbers.stream().count();

    }
}
