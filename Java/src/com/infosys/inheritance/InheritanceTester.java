package com.infosys.inheritance;

import com.infosys.inheritance.example1.Sedan;

public class InheritanceTester {
    public static void main(String[] args) {
        // Example 1
        Sedan nissanVersa = new Sedan("Sedan", 5, "Nissan Versa");
        nissanVersa.display();

        System.out.println();

        // Example 2
        com.infosys.inheritance.example1.example2.CSProfessor csProfessor = new com.infosys.inheritance.example1.example2.CSProfessor("Paul", "York College", "Computer Science");
        csProfessor.display();
    }
}
