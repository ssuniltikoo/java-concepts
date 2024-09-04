package dev.core.concepts.java.concurrency.executors.raceconditons;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Student student1 = new Student(1,"Sunil",'1');
        System.out.println("Before changes"+student1);
        ExecutorService executorService = Executors.newCachedThreadPool();
        UpdateStudentProfile updateStudentProfile = new UpdateStudentProfile(student1,2,"sohit",'2');

        UpdateStudentProfile updateStudentProfile1 = new UpdateStudentProfile(student1,3,"heeya",'3');
         Future<Void> result =  executorService.submit(updateStudentProfile);

        Future<Void> result1 =  executorService.submit(updateStudentProfile1);

         result.get();
         result1.get();

        System.out.println("After changes"+student1);




    }
}
