package inheritance;

import java.util.List;

public class Car extends Vehicle
{
    private Driver driver;
    private List<Person> passengers;

    public Car (Driver driver, List<Person> passengers)
    {
        super(4, 6);
        this.driver = driver;
        this.passengers = passengers;
    }

    public void display()
    {
        if(!driver.validateDriver())
        {
            System.out.println("The driver " + this.driver.getName() + " is unable to drive this car!");
            return;
        }
        if(passengers.size() > this.getOccupant()-1)
        {
            System.out.println("Too many people in the car! " + (passengers.size() - this.getOccupant() + 1) + " passenger(s) get out!");
            return;
        }
        super.display();
        this.driver.display();
        for(Person p : passengers)
        {
            p.display();
        }
        this.drive();
    }

    public void drive()
    {
        System.out.println("We're ready to go! Vroom Vroom!");
    }
}
