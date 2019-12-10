package com.company;

public class Class_E extends Class_D {
    protected String e;

    public Class_E(String a, String b, String c, String d, String e, X x) {
        super(a, b, c, d, x);
        this.e = e;
    }

    public void printProperty() {
        super.printProperty();
        System.out.println(x.getXName());
        System.out.println(e);
    }
}
