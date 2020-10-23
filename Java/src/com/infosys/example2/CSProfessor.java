package com.infosys.example2;

public class CSProfessor extends Professor {

    private String mainSubject;

    public CSProfessor(String name, String college, String mainSubject) {
        super(name, college);
        this.mainSubject = mainSubject;
    }

    public String getMainSubject() {
        return mainSubject;
    }

    public void setMainSubject(String mainSubject) {
        this.mainSubject = mainSubject;
    }

    public void display() {
        System.out.println("My name is " + getName() + " and I am a " + getMainSubject()
                + " Professor at "+ getCollege() +".");
    }
}
