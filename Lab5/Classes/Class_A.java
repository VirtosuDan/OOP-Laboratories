package com.company;

public class Class_A {
    protected String a;
    protected X x = new X("xxx");

    public Class_A(String a, X x) {
        this.a = a;
        this.x = x;
    }

    public void printProperty() {
        System.out.println(x.getXName());
        System.out.println(a);
    }
}
