package dev.core.concepts.java.concurrency.executors.procducerconsumer;

import java.awt.*;

public class Consumer implements Runnable {
    private Store store;

    public Consumer(final Store store) {
        this.store = store;
    }

    @Override
    public void run() {

        while (true) {
            synchronized (store) {
                if (store.getListItems().size() > 0) {
                    store.removeItem();
                }
            }
        }

    }
}
