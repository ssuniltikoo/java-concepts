package dev.core.concepts.java.concurrency.executors.mergesort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {

   private final List<Integer> listOfNumbers;
   private final ExecutorService executor;

    public Sorter(List<Integer> listOfNumbers, ExecutorService executor) {
        this.listOfNumbers = listOfNumbers;
        this.executor = executor;

    }

    @Override
    public List<Integer> call() throws Exception {
        if(listOfNumbers.size()<=1){
            return listOfNumbers;
        }

        int mid = ((listOfNumbers.size())/2);

        List<Integer> leftArrayToSort = new ArrayList(); //<Integer>(listOfNumbers.subList(0, mid-1));

        for(int i =0; i < mid; i++){
            leftArrayToSort.add(listOfNumbers.get(i));
        }

        List<Integer> rightArrayToSort = new ArrayList();//(listOfNumbers.subList(mid,listOfNumbers.size()-1));

        for(int j=mid; j < listOfNumbers.size(); j++){
            rightArrayToSort.add(listOfNumbers.get(j));
        }

        Sorter leftSortedArray  = new Sorter(leftArrayToSort, executor);

        Sorter rightSortedArray = new Sorter(rightArrayToSort, executor);

        Future<List<Integer>> leftFuture = executor.submit(leftSortedArray);
        Future<List<Integer>> rightFuture = executor.submit(rightSortedArray);

        List<Integer> leftSorted = leftFuture.get();
        List<Integer> rightSorted = rightFuture.get();

        int i=0;
        int j=0;

        List<Integer> sortedArray = new ArrayList();

        while(i < leftSorted.size() && j < rightSorted.size()){
            if(leftSorted.get(i)<rightSorted.get(j)){
                sortedArray.add(leftSorted.get(i));
                i++;
            }else{
                sortedArray.add(rightSorted.get(j));
                j++;
            }
        }

        while(i < leftSorted.size()){
            sortedArray.add(leftSorted.get(i));
            i++;
        }

        while(j < rightSorted.size()){
            sortedArray.add(rightSorted.get(j));
            j++;
        }

        return sortedArray;
    }
}
