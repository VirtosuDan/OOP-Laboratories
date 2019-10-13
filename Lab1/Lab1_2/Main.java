package com.company;

public class Main {

    public static void main(String[] args) {
         Student Dan = new Student("Dan","20","9");
         Student Nicu = new Student("Nicu","25","10");
         Student Vlada = new Student("Vlada","18","9");


        University UTM = new University("UTM","1964",Dan);
        University USM = new University("USM","1955",Nicu);
        University UMF = new University("UMF","1888",Vlada);

        UTM.print();
        USM.print();
        UMF.print();

    }
}
