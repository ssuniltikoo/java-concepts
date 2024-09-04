package dev.core.concepts.java.concurrency.executors.Adder;

public class Adder implements Runnable{
   private final NumberClazz numberClazz;

    public Adder(NumberClazz numberClazz){
        this.numberClazz = numberClazz;
    }

    @Override
    public void run() {
        for(int i =0; i <10000000; i++){
          //  synchronized (numberClazz){

                numberClazz.num+=1;
           // }

           // System.out.println(Thread.currentThread().getName() + " value of num from Adder  is now:  " + numberClazz.num );
        }

    }
}
