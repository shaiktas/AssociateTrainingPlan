package com.infosys.example1;

public class Vehicle {

    private String type;
    private int numOfSeats;

    public Vehicle(String type, int numOfSeats) {
        this.type = type;
        this.numOfSeats = numOfSeats;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }
}
