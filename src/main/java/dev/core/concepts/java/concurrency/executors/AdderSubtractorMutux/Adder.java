package dev.core.concepts.java.concurrency.executors.AdderSubtractorMutux;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {

   private Value value;
   private Lock lock;

    public Adder(Value value, Lock lock) {
        this.value = value;
        this.lock = lock;
    }

    @Override
    public Void call() throws Exception {
        for(int i=0; i < 1000; ++i){
                lock.lock();
               // lock.lock();
                //lock.lock();
                this.value.num += 1;
            System.out.println("Adder "+ value.num);
                lock.unlock();
                //lock.unlock();
                //lock.unlock();
        }
        return null;
    }
}
