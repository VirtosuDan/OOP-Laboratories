package com.company;

public class Address {
    private String Country;
    private String City;
    private String Street;
    private int NumberOfHouse;

    public String getAddress() {
        return Country + City +  Street + NumberOfHouse;
    }

}

