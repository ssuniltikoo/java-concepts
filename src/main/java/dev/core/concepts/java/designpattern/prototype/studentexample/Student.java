package dev.core.concepts.java.designpattern.prototype.studentexample;

public class Student {
    private String name;
    private int age;
    private char gender;
    private double percentage;
    private Batch batch;


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public void setBatch(Batch batch) {
        this.batch = batch;
    }

    public Student() {}

    public Student(Student student) {
        this.name = student.name;
        this.age = student.age;
        this.gender = student.gender;
        this.percentage = student.percentage;
        this.batch = student.batch;

    }
    public Student(String name, int age, char gender, double percentage, Batch batch) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.percentage = percentage;
        this.batch = batch;

    }

    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", gender=" + gender + ", percentage="+ percentage + ", batch=" + batch + "]";
    }

    public Student copyStudent() {
        return this;

    }

    // deep copy
    public Student cloneStudent() {
//        Student newStudent = new Student();
//        newStudent.name = this.name;
//        newStudent.age = this.age;
//        newStudent.gender = this.gender;
//        newStudent.percentage = this.percentage;
//        newStudent.batch = this.batch;
//        return newStudent;
        return new Student(this);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public double getPercentage() {
        return percentage;
    }

    public Batch getBatch() {
        return batch;
    }
}
