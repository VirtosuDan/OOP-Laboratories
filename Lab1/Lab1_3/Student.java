package com.company;

public class Student {
    private String StudentName;
    private String age;
    private double mark;

    public Student(String studentName, String age, double mark) {
        this.StudentName = studentName;
        this.age = age;
        this.mark = mark;
    }
    public double getMark(){
        return mark;
    }
}