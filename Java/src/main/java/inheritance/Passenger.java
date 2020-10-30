package inheritance;

import inheritance.Person;

public class Passenger extends Person
{
    private int luggage;

    public Passenger(String name, int age, String gender, int luggage)
    {
        super(name, age, gender);
        this.luggage = luggage;
    }

    public int getLuggage() {
        return luggage;
    }

    public void setLuggage(int luggage) {
        this.luggage = luggage;
    }

    public void display()
    {
        super.display();
        System.out.println(this.getName() + " is a passenger with " + this.luggage + " piece(s) of luggage");
    }
}
