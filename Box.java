package com.company;

public class Box {
    private double height;
    private double width;
    private double depth;

    private double volume;

    public Box(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public Box ( double x){
        this.height = x;
        this.width = x;
        this.depth = x;
    }

    public Box(){
        this.height = 1.0;
        this.width =1.0;
        this.depth = 1.0;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getDepth() {
        return depth;
    }

    public void determineBoxSurface (){
        double surface;
        surface = 2*(height*width+height*depth+depth*height);
        System.out.println("The surface is:"+surface);
    }

    public void determineBoxVolume(){
        volume = height*width*depth;
        System.out.println("The volume is:"+this.volume);
    }

}

