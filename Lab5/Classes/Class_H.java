package com.company;

public class Class_H extends Class_G {
    protected String h;
    protected X x = new X("xxx");

    public Class_H(String a, String b, String c, String d, String e, String f, String g, String h, X x) {
        super(a, b, c, d, e, f, g, x);
        this.h = h;
    }

    public void printProperty() {
        super.printProperty();
        System.out.println(x.getXName());
        System.out.println(h);
    }
}
