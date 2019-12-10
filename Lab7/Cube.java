package com.company;

public class Cube implements GeometricBody {
     public double edgeLength;


     public Cube (double edgeLength){
         this.edgeLength=edgeLength;
     }

     public double getSurface(){
         double surface;
         surface = 6 * (edgeLength * edgeLength);
                 return surface;
     }

     public double getVolume(){
         double volume;
         volume = edgeLength*edgeLength*edgeLength;
         return volume;
     }
}
