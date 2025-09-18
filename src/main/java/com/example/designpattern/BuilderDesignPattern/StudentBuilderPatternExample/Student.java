package com.example.designpattern.BuilderDesignPattern.StudentBuilderPatternExample;

import java.util.List;

public class Student {

    private int rollNumber;
    private String name;
    
    // Optional fields:
    private int age;
    private String fatherName;
    private String motherName;
    private List<String> subjects;
    
    public Student(StudentBuilder stb){

        this.rollNumber = stb.rollNumber;
        this.name = stb.name;
        this.age = stb.age;
        this.fatherName = stb.fatherName;
        this.motherName = stb.motherName;
        this.subjects = stb.subjects;
    }

    @Override
    public String toString() {
        return "Student [rollNumber=" + rollNumber + ", name=" + name + ", age=" + age + ", fatherName=" + fatherName
                + ", motherName=" + motherName + ", subjects=" + subjects + "]";
    }
    
}
