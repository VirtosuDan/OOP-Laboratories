package com.company;

public class University {
    private String UniversityName;
    private String foundationYear;
    Student[] Student;

    public University(String UniversityName, String foundationYear, Student[] Student) {
        this.UniversityName = UniversityName;
        this.foundationYear = foundationYear;
        this.Student = Student;
    }
    public double media(){
        double result = 0;
        for (int i=0;i<Student.length;i++)
        {
            result +=Student[i].getMark();
        }
        return result/Student.length;
    }

    public double mediaUniv()
    {
        return media();
    }
}
