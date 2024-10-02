package dev.core.concepts.java.designpattern.builder;

public class Client {

    public static void main(String[] args) {
        Student student = Student.getBuilder()
                .setName("sunil")
                .setAge(19)
                .setBatch("May 2023")
                .setPsp(78.23)
                .setGradYear(2000)
                .setRollNumber(0)
                .setUnivName("test")
                .build();

        System.out.println(" student :" + student.toString());
    }
}
