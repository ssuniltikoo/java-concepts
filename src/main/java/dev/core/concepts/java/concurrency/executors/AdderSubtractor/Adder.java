package dev.core.concepts.java.concurrency.executors.AdderSubtractor;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {

   private  Value value;

    public Adder(Value value) {
        this.value = value;
    }

    @Override
    public Void call() throws Exception {
        for(int i=0; i < 100000; ++i){
            synchronized(value) {
                this.value.num += 1;
            }
        }
        return null;
    }
}
