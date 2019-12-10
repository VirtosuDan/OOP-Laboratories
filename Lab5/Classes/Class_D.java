package com.company;

public class Class_D extends Class_C {
    protected String d;
    protected X x = new X("xxx");

    public Class_D(String a, String b, String c, String d, X x) {
        super(a, b, c, x);
        this.d = d;
    }

    public void printProperty() {
        super.printProperty();
        System.out.println(x.getXName());
        System.out.println(d);
    }
}
