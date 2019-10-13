package com.company;

public class Student {
    private String StudentName;
    private String age;
    private String mark;

    public Student(String studentName, String age, String mark) {
        this.StudentName = studentName;
        this.age = age;
        this.mark = mark;
    }

    public String print(){

        return "Numele: "+ this.StudentName + " Nota: " +this.mark + " Varsta: " + this.age;
    }
}