package com.example.designpattern.BuilderDesignPattern.StudentBuilderPatternExample;

import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder {

    public MBAStudentBuilder(int rollNumber, String name){
        super(rollNumber, name);
    }

    @Override
    public StudentBuilder setSubject() {
        
        List<String> sub = new ArrayList<>();
        sub.add("Micro Economics");
        sub.add("Business Studies");
        this.subjects = sub;

        return this;
    }

}
