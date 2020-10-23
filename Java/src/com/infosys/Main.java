package com.infosys;

import com.infosys.example1.Sedan;
import com.infosys.example2.CSProfessor;

public class Main {

    public static void main(String[] args) {
        // Example 1
        Sedan nissanVersa = new Sedan("Sedan", 5, "Nissan Versa");
        nissanVersa.display();

        System.out.println();

        // Example 2
        CSProfessor csProfessor = new CSProfessor("Paul", "York College", "Computer Science");
        csProfessor.display();
    }
}
