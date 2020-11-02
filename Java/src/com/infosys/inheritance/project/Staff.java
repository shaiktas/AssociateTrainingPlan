package com.infosys.inheritance.project;

public class Staff extends Person {
    private String school;
    private int pay;

    public Staff(String name, String address, String school, int pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }
}
