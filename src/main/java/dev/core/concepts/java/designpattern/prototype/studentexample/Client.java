package dev.core.concepts.java.designpattern.prototype.studentexample;



public class Client {










    public static void main(String[] args) {



        Student student = new Student();
        Student student2 = student.cloneStudent();

        Student student3 = new IntelligentStudent();

        Student student4 = student3.cloneStudent();


        System.out.println(student4);

//        Student student = new Student("ROHIT",15,'M',98,Batch.APR
//
//        );

//        System.out.println(student.toString());
//
//        Student s1 = student.copyStudent();
//
//        System.out.println(s1);
//
//        Student s2 = student.cloneStudent();
//
//        System.out.println(s2);
//
//        student.setName("SOHIT");
//        System.out.println(s1);
//        System.out.println(s2);
//

        Student NOVEMBERBATCH = new Student(null,0,'M',50,Batch.JAN);



//        Student apple = NOVEMBERBATCH.cloneStudent();
//        apple.setName("apple");
//        apple.setAge(12);
//
//        Student  banana = NOVEMBERBATCH.cloneStudent();
//        banana.setName("banana");
//        banana.setAge(22);
//       // banana.setIq(10);
//
//        System.out.println(apple);
//        System.out.println(banana);
        Student APRILBATCH = (IntelligentStudent)new IntelligentStudent(null,0,'F',100,Batch.APR,0);

        Registry registry= new Registry();
        registry.addStudent("nov21batch", NOVEMBERBATCH );

        registry.addStudent("april21batch", APRILBATCH);

        Student iQStudent = APRILBATCH.cloneStudent();

        registry.addStudent("april23batch", iQStudent);



        Student novStudent1=registry.getStudent("nov21batch").cloneStudent();

        

//        iQStudent.setName("star kid");
//        iQStudent.setAge(3);
//      //  iQStudent.set
//        System.out.println(iQStudent);



    }
}
