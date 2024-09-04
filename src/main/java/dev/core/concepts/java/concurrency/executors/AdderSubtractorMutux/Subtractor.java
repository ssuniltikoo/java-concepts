package dev.core.concepts.java.concurrency.executors.AdderSubtractorMutux;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {
   private Value value;
   private Lock lock;

    public Subtractor(Value value, Lock lock) {
        this.value = value;
        this.lock = lock;
    }

    @Override
    public Void call()  {
        for(int i=0; i < 1000; ++i){
         lock.lock();
         this.value.num -= 1;
           System.out.println("subtractor "+ value.num);
          lock.unlock();
        }
        return null;
    }
}