package com.company;

public class Main {

    public static void main(String[] args) {

        Box box1 = new Box();
        System.out.println("Datas for box1:");
        System.out.println("Height:"+box1.getHeight()+"\tDepth:"+box1.getDepth()+"\tWidth:"+box1.getWidth());


        Box box2 = new Box(5.0);
        System.out.println("\nDatas for box2:");
        System.out.println("Height:"+box2.getHeight()+"\tDepth:"+box2.getDepth()+"\tWidth:"+box2.getWidth());

        Box box3 = new Box(5.0,10.5,12.2);
        System.out.println("\nDatas for box3");
        System.out.println("Height:"+box3.getHeight()+"\tDepth:"+box3.getDepth()+"\tWidth:"+box3.getWidth());
        System.out.println("\n");

        System.out.println("Box 1:");
        box1.determineBoxSurface();
        box1.determineBoxVolume();

        System.out.println("\nBox2:");
        box2.determineBoxSurface();
        box2.determineBoxVolume();

        System.out.println("\nBox3:");
        box3.determineBoxSurface();
        box3.determineBoxVolume();

    }
}
