package com.autowire;

public class Emp {
    private Address address;

//    Getters
    public Address getAddress() {
        return address;
    }

//    Setters
    public void setAddress(Address address) {
        this.address = address;
    }

//    constructor
    public Emp(Address address) {
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
