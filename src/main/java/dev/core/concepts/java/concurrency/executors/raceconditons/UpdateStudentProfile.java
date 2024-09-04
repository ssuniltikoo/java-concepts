package dev.core.concepts.java.concurrency.executors.raceconditons;

import java.util.concurrent.Callable;

public class UpdateStudentProfile implements Callable<Void> {
    private final Student student;
    private int id;
    private String name;
    private char grade;
    public UpdateStudentProfile(final Student student, int id,String name, char grade ) {
        this.student = student;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    @Override
    public Void call() throws Exception {
        for(int i =0; i < 10000; i++) {
            if (id != student.getId()) {
                student.setId(id);
            }

            if (name != null) {
                student.setName(name);
            }

            if (grade != student.getGrade()) {
                student.setGrade(grade);
            }
        }


        return null;
    }
}
