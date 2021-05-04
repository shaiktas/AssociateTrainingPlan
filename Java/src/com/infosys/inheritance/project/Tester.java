package com.infosys.inheritance.project;

public class Tester {
    public static void main(String[] args) {
        Student student1 = new Student("Billy", "105-23 90Ave",
                "CS", 2020, 20000);
        Student student2 = new Student("Dave", "222-33 44Ave",
                "MATH", 2021, 25000);

        Staff staff1 = new Staff("Stacy", "949-23 34Ave", "Bayside", 60000);
        Staff staff2 = new Staff("Cindy", "493-05 43Ave", "Cardozo", 50000);
    }
}
