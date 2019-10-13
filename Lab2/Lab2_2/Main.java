package com.company;

public class Main {

    public static void main(String[] args) {

        Queue q1 = new Queue();
        System.out.println("The elements of Queue1 are:");
        q1.push(16);
        q1.push(156);
        q1.push(32);
        q1.push(47);
        q1.push(78);
        q1.push(93);
        q1.push(52);
        q1.showElements();

        System.out.println("\nElement that we want to delete is: "+q1.pop(0));

        System.out.println("\nFinal Queue 1 is:");
        q1.showElements();

        q1.isEmpty();
        q1.isFull();



        Queue q2 = new Queue(2);
        System.out.println("\n\nThe elements of Queue 2 are:");
        q2.push(16);
        q2.push(156);
        q2.push(32);
        q2.push(47);

        q2.showElements();


        q1.isEmpty();
        q2.isFull();



    }
}
