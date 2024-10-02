package dev.core.concepts.java.designpattern.prototype.studentexample;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Registry implements Serializable {

    private Map<String,Student> studentMap = new HashMap<>();

    public void addStudent(String name, Student student) {
        studentMap.put(name, student);
    }

    public Student getStudent(String name) {
       return studentMap.get(name);
    }
}
