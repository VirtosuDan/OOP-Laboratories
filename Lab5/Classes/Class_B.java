package com.company;

public class Class_B extends Class_A {
    protected String b;

    public Class_B(String a, String b, X x) {
        super(a, x);
        this.b = b;
    }

    public void printProperty() {
        super.printProperty();
        System.out.println(x.getXName());
        System.out.println(b);
    }
}
