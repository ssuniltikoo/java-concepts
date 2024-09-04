package dev.core.concepts.java.concurrency.executors.procducerconsumer;

public class Producer  implements Runnable {
    private Store store;

    public Producer(Store store) {
        this.store = store;
    }


    @Override
    public void run() {
        while(true) {
            synchronized (store){
                if(store.getMaxSize()>store.getListItems().size()){
                    store.addItem();
                }

            }
        }

    }
}
