package dev.core.concepts.java.concurrency.executors.raceconditons;

public class Student {
    private int id;
    private String name;
    private char grade;
    public Student(int id, String name, char grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public Student(){

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGrade() {
        return grade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", grade=" + grade + "]";
    }

}
