package dev.core.concepts.java.concurrency.executors.atomic;

import java.util.ArrayList;
import java.util.List;


public class Store {

    private int maxSize;

    private List<Object> listItems;

    public Store(int maxSize) {
        this.maxSize = maxSize;
        this.listItems = new ArrayList<Object>();
    }

    public int getMaxSize() {
        return maxSize;
    }

    public List<Object> getListItems() {
        return listItems;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public void setListItems(List<Object> listItems) {
        this.listItems = listItems;
    }

    public void addItem() {
        this.listItems.add(null);
        System.out.println("item produced new count: " + this.listItems.size());
    }

    public void removeItem() {
        this.listItems.remove(this.listItems.size()-1);
        System.out.println("item consumer new count: " + this.listItems.size());
    }


}
