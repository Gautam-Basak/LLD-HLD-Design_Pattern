package com.example.designpattern.BuilderDesignPattern.StudentBuilderPatternExample;

import java.util.List;

public abstract class StudentBuilder {

    // Mandatory fields:
    protected int rollNumber;
    protected String name;
    
    // Optional fields:
    protected int age;
    protected String fatherName;
    protected String motherName;
    protected List<String> subjects;

    public StudentBuilder(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

     // Setters for optional fields returning StudentBuilder for chaining.
    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public StudentBuilder setMotherName(String motherName) {
        this.motherName = motherName;
        return this;
    }

    public abstract StudentBuilder setSubject();

    public Student build(){
        return new Student(this);
    }
    
}
