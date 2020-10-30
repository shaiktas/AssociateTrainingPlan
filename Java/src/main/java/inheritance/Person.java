package inheritance;

import java.util.Date;

public class Person
{
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void display()
    {
        System.out.println("This is a person named " + this.name + " and they are " + this.age + " years old and their gender is " + this.gender);
    }
}
