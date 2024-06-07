package com.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
    @Autowired   //Properties Annotation Autowiring
    @Qualifier("address2")   // Qualifier ius used to use particular bean
    private Address address;

//    Getters
    public Address getAddress() {
        return address;
    }

//    Setters
//    @Autowired   // Setter Annotation Autowiring
//    @Qualifier("address2")   // Qualifier ius used to use particular bean
    public void setAddress(Address address) {
        System.out.println("Setter Called...");
        this.address = address;
    }

//    constructor
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
