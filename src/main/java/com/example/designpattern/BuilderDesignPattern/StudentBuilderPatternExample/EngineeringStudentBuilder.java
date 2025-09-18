package com.example.designpattern.BuilderDesignPattern.StudentBuilderPatternExample;

import java.util.ArrayList;
import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder{

    public EngineeringStudentBuilder(int rollNumber, String name){
        super(rollNumber, name);
    }

    @Override
    public StudentBuilder setSubject() {
        
        List<String> sub = new ArrayList<>();
        sub.add("Fluid Dynamics");
        sub.add("Mechanics");
        this.subjects = sub;

        return this;
    }
    
}
