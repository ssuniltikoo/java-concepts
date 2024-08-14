package dev.core.concepts.java.concurrency.executors;

public class FormatPrinter implements Runnable{
    private int a;
    public FormatPrinter(int a){
        this.a = a;
    }

    public void run(){
        System.out.println(Thread.currentThread().getName() + " for value of i "+ a);
        for(int i=1; i < a;i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
              //  System.out.print("\t");
            }
            System.out.println("\n");
        }
    }
}
