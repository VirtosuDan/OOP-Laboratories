package com.company;

public class Class_F extends Class_E {
    protected String f;

    public Class_F(String a, String b, String c, String d, String e, String f, X x) {
        super(a, b, c, d, e, x);
        this.f = f;
    }

    public void printProperty() {
        super.printProperty();
        System.out.println(x.getXName());
        System.out.println(f);
    }
}
