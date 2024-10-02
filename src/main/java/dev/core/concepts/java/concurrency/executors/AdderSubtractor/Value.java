package dev.core.concepts.java.concurrency.executors.AdderSubtractor;

import java.util.concurrent.atomic.AtomicInteger;

public class Value {
    //    int num=0;
    public AtomicInteger num;

    public Value(){
        num = new AtomicInteger(0);
    }

    

}
