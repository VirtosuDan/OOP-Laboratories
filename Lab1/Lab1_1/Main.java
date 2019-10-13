package com.company;

public class Main {

    public static void main(String[] args) {
        Monitor DELL = new Monitor();
        Monitor ASUS = new Monitor();

        DELL.setColor("Blue");
        DELL.setDimensions("19-inch");
        DELL.setResolution("1680x1050");

        System.out.println("The properties of Monitor Danu are :");
        System.out.println("Color:"+ DELL.getColor()+"\nDimensions:"+DELL.getDimensions()+"\nResolution:"+DELL.getResolution());


        ASUS.setColor("Green");
        ASUS.setDimensions("21-inch");
        ASUS.setResolution("1920x1080");

        System.out.println("\n"+"The properties of Monitor Nicu are:");
        System.out.println("Color:"+ ASUS.getColor()+"\nDimensions:"+ASUS.getDimensions()+"\nResolution:"+ASUS.getResolution());

        System.out.println("\nThe result after comparison: "+DELL.equals(ASUS));

    }
}
