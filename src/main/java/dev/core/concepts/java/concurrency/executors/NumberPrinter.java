package dev.core.concepts.java.concurrency.executors;

public class NumberPrinter implements Runnable{
    private final int num;
    public NumberPrinter(final int num){
        this.num = num;
    }
    @Override
    public void run() {
        System.out.println(num + " printed by "+ Thread.currentThread().getName());
    }
}
