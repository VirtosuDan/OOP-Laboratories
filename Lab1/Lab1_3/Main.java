package com.company;

public class Main {

    public static void main(String[] args) {
        Student Dan = new Student("Dan","20",9.);
        Student Nicu = new Student("Nicu","25",8.9);
        Student Vlada = new Student("Vlada","18",9.2);
        Student Catalin = new Student ("Catalin","22",8.9);
        Student Alex = new Student ("Alex","18",9.6);
        Student Victor = new Student("Victor","21",8.9);

        Student[] UnivTehnica = {Dan,Nicu};
        Student[] UnivMedicina = {Vlada,Catalin};
        Student[] UnivStat = {};

        University UTM = new University("UTM","1964",UnivTehnica);
        University USM = new University("USM","1955",UnivStat);
        University UMF = new University("UMF","1888",UnivMedicina);

        System.out.println("Media notelor la Universitatea Tehnica : "+UTM.media());
        System.out.println("Media notelor la Universitatea de Stat: "+USM.media());
        System.out.println("Media notelor la Universitatea de Medicina: "+UMF.media());

        System.out.println("Media generala este: "+(UTM.mediaUniv()+USM.mediaUniv()+UMF.mediaUniv())/3);

    }
}
