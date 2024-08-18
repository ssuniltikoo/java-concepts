package dev.core.concepts.java.concurrency.executors.generic;

import java.util.ArrayList;
import java.util.List;

public class MyClazz<T> {

    List<T> list = new ArrayList<>();

    void add(T items){
        list.add(items);
    }



}
