package com.example.designpattern.BuilderDesignPattern.StudentBuilderPatternExample;

public class Director {

    private StudentBuilder stuBuilder;

    public Director(StudentBuilder stb) {
        this.stuBuilder = stb;
    }

    public Student createStudent() {

        if (stuBuilder instanceof EngineeringStudentBuilder) {

            return createEngineeringStudent();

        } else if (stuBuilder instanceof MBAStudentBuilder) {

            return createMBAStudent();

        } 

        return null;
    }

    private Student createEngineeringStudent() {

        return stuBuilder.setAge(34)
                         .setFatherName("Baba")
                         .setMotherName("Maa")
                         .setSubject()
                         .build();
    }

    private Student createMBAStudent() {

        return stuBuilder.setAge(38)
                         .setFatherName("Papa")
                         .setMotherName("Mom")
                         .build();
    }
}
