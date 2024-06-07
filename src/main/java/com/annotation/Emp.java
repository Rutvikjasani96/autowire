package com.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
//    @Autowired   //Properties Annotation Autowiring
    private Address address;

//    Getters
    public Address getAddress() {
        return address;
    }

//    Setters
//    @Autowired   // Setter Annotation Autowiring
    public void setAddress(Address address) {
        System.out.println("Setter Called...");
        this.address = address;
    }

//    constructor
    @Autowired   // Constructor Annotation Autowiring
    public Emp(Address address) {
        System.out.println("Inside the Constructor...");
        this.address = address;
    }

    public Emp() {
    }

    //    toString
    @Override
    public String toString() {
        return "Emp{" +
                "address=" + address +
                '}';
    }
}
