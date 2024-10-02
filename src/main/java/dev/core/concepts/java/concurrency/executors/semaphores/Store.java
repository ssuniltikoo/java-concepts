package dev.core.concepts.java.concurrency.executors.semaphores;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;


public class Store {

    private int maxSize;

    private Queue<Object> listItems;

    public Store(int maxSize) {
        this.maxSize = maxSize;
        this.listItems = new ConcurrentLinkedQueue<>();
    }

    public int getMaxSize() {
        return maxSize;
    }

    public Queue<Object> getListItems() {
        return listItems;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public void setListItems(Queue<Object> listItems) {
        this.listItems = listItems;
    }

    public void addItem() {
        this.listItems.add(new Object());
        System.out.println("item produced new count: " + this.listItems.size());
    }

    public void removeItem() {
        this.listItems.remove();
        System.out.println("item consumer new count: " + this.listItems.size());
    }


}
