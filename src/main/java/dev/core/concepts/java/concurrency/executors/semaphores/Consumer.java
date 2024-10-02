package dev.core.concepts.java.concurrency.executors.semaphores;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {
    private Store store;
    private Semaphore producerSemaphore;

    private Semaphore consumerSemaphore;

    public Consumer(final Store store, final Semaphore producerSemaphore, final Semaphore consumerSemaphore) {
        this.store = store;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }

    @Override
    public void run() {

        while (true) {
            try {
                consumerSemaphore.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
         //   if (store.getListItems().size() > 0) {
                    store.removeItem();

           // }
                producerSemaphore.release();
        }

    }
}
