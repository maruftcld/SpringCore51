package com.spring.test;

public class Address {
    private String area;
    private String city;

    public Address(String area, String city) {
        this.area = area;
        this.city = city;
    }

    @Override
    public String toString() {
        return "area : / " + area + " city : / " + city; //To change body of generated methods, choose Tools | Templates.
    }
}