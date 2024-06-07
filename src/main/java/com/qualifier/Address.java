package com.qualifier;

public class Address {
    private String street;
    private String city;

//    Getters
    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

//    Setters
    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    //    toString
    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
