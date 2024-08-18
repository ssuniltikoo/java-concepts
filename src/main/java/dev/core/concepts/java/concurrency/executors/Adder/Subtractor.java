package dev.core.concepts.java.concurrency.executors.Adder;

public class Subtractor implements Runnable{

   private final  NumberClazz numberClazz;

    public Subtractor(NumberClazz numberClazz) {
        this.numberClazz = numberClazz;
    }

    @Override
    public void run() {
        for(int i =0; i <10000000; i++){
            synchronized (numberClazz) {
                numberClazz.num-=1;
            }

          //  System.out.println(Thread.currentThread().getName() + " value of num from Subtractor  is now:  " + numberClazz.num );
        }

    }
}
