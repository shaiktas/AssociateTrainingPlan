package inheritance;

public class Vehicle
{
    private int wheel;
    private int occupant;

    public Vehicle(int wheel, int occupant)
    {
        this.wheel = wheel;
        this.occupant = occupant;
    }

    public int getOccupant() {
        return occupant;
    }

    public void setOccupant(int occupant) {
        this.occupant = occupant;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public void display()
    {
        System.out.println("I am a vehicle with " + this.wheel + " wheels and I can hold " + this.occupant + " people");
    }


}
