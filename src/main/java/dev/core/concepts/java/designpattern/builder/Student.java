package dev.core.concepts.java.designpattern.builder;

import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Student {


    private String name;
    private int age;
    private double psp;
    private String batch;
    private int gradYear;
    private String univName;
    private int rollNumber;

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", psp=" + psp + ", batch=" + batch + ", gradYear="  + gradYear + ", univName=" + univName + ", rollNumber=" + rollNumber + "]" ;
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    private Student(Builder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.psp = builder.psp;
        this.batch = builder.batch;
        this.gradYear = builder.gradYear;
        this.univName = builder.univName;
        this.rollNumber = builder.rollNumber;


    }

    // inner class
     static class Builder{

         private String name;
         private int age;
         private double psp;
         private String batch;
         private int gradYear;
         private String univName;
         private int rollNumber;

        public Builder setName(String name){
           this.name = name;
           return this;
        }


        public Builder setAge(int age){
            this.age = age;
            return this;
        }

        public Builder setPsp(double psp){
            this.psp = psp;
            return this;
        }

        public Builder setBatch(String batch){
            this.batch = batch;
            return this;
        }

        public Builder setGradYear(int gradYear){
            this.gradYear = gradYear;
            return this;
        }

        public Builder setUnivName(String univName){
            this.univName = univName;
            return this;
        }

        public Builder setRollNumber(int rollNumber){
            this.rollNumber = rollNumber;
            return this;
        }



        public Student build(){
            if(name == null){
                throw new NullPointerException("name is null");
            }
            if(age <18 || age > 60){
                throw new IllegalArgumentException("age must be between 18 and 60");
            }
            if(psp > 100 || psp < 0){
                throw new IllegalArgumentException("psp must be between 0 and 100");
            }
            if(batch == null){
                throw new NullPointerException("batch is null");
            }
            if(gradYear >= 2023 || gradYear <= 1980){
                throw new IllegalArgumentException("gradYear must be between 2023 and 1980");
            }
            return new Student(this);
        }
    }
}
