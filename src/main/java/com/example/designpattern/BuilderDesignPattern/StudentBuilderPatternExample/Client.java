package com.example.designpattern.BuilderDesignPattern.StudentBuilderPatternExample;

public class Client {

    public static void main(String[] args) {

        StudentBuilder engStuBuilder = new EngineeringStudentBuilder(1, "Gautam");
        StudentBuilder mbaStuBuilder = new MBAStudentBuilder(2, "Arpita");

        Director engDirector = new Director(engStuBuilder);
        Director mbaDirector = new Director(mbaStuBuilder);

        Student engStudent = engDirector.createStudent();
        Student mbaStudent = mbaDirector.createStudent();

        System.out.println(engStudent.toString());
        System.out.println(mbaStudent.toString());
    }

}
