package com.spring.test;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "t121") 
public class Trainee {
    //primitive type
    private int id;
    private String name;
    private boolean status;
    private String course;
    
    //class type
    @Autowired
    private Address address;
    
    //Collection type
   // private List<Address> addresses;

//    public Trainee(List<Address> addresses) {
//        System.out.println("list DI by constructor");
//        this.addresses = addresses;
//    }
//
//    public void setAddresses(List<Address> addresses) {
//        this.addresses = addresses;
//    }    
    
    public Trainee(Address address) {
        this.address = address;
        System.out.println("address class");
    }

    
    public void setAddress(Address address) {
        this.address = address;
    }

    public Trainee(String name, String course) {
        this.name = name;
        this.course = course;
    }

    public Trainee() {
        System.out.println("user defined default constructor");
    }

    public Trainee(int id) {
        this.id = id;
    }

    public Trainee(boolean status) {
        this.status = status;
    }

    public Trainee(int id, boolean status) {
        this.id = id;
        this.status = status;
        System.out.println("constructor DI");
        System.out.println("2 properties");
    }

    public Trainee(int id, String name, boolean status) {
        this.id = id;
        this.name = name;
        this.status = status;
        System.out.println("3 properties");
    }

    public void setId(int id) {
        System.out.println("Setter DI");
        this.id = id;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    

    @Override
    public String toString() {
//        for (Address addr : addresses) {
//            System.err.println(addr);
//        }
        return "id : " + id + " / name : " + name + " status : " + status + " course : " + course + " address : / " + address; //To change body of generated methods, choose Tools | Templates.
    }
    
    void start(){
        System.out.println("start");
    }
    
    void end(){
        System.out.println("end");
    }

}