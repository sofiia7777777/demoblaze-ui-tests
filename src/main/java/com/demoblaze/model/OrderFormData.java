package com.demoblaze.model;

public class OrderFormData {
    private String name;
    private String country;
    private String city;
    private String creditCard;
    private String month;
    private String year;

    public OrderFormData(String name, String country, String city, String creditCard, String month, String year) {
        this.name = name;
        this.country = country;
        this.city = city;
        this.creditCard = creditCard;
        this.month = month;
        this.year = year;
    }

    public String getName() { return name; }
    public String getCountry() { return country; }
    public String getCity() { return city; }
    public String getCreditCard() { return creditCard; }
    public String getMonth() { return month; }
    public String getYear() { return year; }
}
