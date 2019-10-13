package com.company;

public class University {
    private String UniversityName;
    private String foundationYear;
    Student Student;

    public University(String UniversityName, String foundationYear , Student Student)
    {
        this.UniversityName = UniversityName;
        this.foundationYear = foundationYear;
        this.Student = Student;
    }

    public void print(){
        System.out.println("Universitatea :"+this.UniversityName+" \nAnul fondarii:" +this.foundationYear +" \nDatele Studentului: " + Student.print()+"\n\n");
    }
}
