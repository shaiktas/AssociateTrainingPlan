package com.infosys.inheritance.project;

public class Student extends Person {
    private String program;
    private int year;
    private int fees;

    public Student(String name, String address, String program, int year, int fees) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fees = fees;
    }
}
