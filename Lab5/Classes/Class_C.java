package com.company;

public class Class_C extends Class_B {
    protected String c;

    public Class_C(String a, String b, String c, X x) {
        super(a, b, x);
        this.c = c;
    }

    public void printProperty() {
        super.printProperty();
        System.out.println(x.getXName());
        System.out.println(c);
    }
}
