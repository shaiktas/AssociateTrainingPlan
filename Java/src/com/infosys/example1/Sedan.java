package com.infosys.example1;

public class Sedan extends Vehicle {

    private String company;

    public Sedan(String type, int numOfSeats, String company) {
        super(type, numOfSeats);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void display() {
        System.out.println("This is a " + getCompany()+" "+ getType() + " and it can hold up to "
                + getNumOfSeats() + " passengers.");
    }
}
