package inheritance;

import inheritance.Car;
import inheritance.Driver;
import inheritance.Passenger;
import inheritance.Person;

import java.util.Arrays;
import java.util.List;

public class Runner
{
    public static void main(String [] args)
    {
        Person p1 = new Person("Sree", 22, "female");
        Person p2 = new Passenger("Shruti", 23, "nonbinary", 1);
        Driver d1 = new Driver("a little baby", 0, "male", false);
        Driver d2 = new Driver("Seiji", 23, "male", false);
        Driver d3 = new Driver("Julio", 23, "male", true);
        Passenger p3 = new Passenger("Catherine", 22, "female", 3);
        Person p4 = new Passenger("Olivia", 23, "female", 0);
        Person p5 = new Passenger("Sharon", 23, "female", 1);
        Passenger p6 = new Passenger("Cate", 22, "female", 6);
        List<Person> passengers1 = Arrays.asList(p1, p2, p3, p4, p5, p6);
        List<Person> passengers2 = Arrays.asList(p1, p2, p3, p4, p5);
        Vehicle v1 = new Vehicle(2, 1);
        Vehicle v2 = new Car(d1, passengers1);
        Car c1 = new Car(d2, passengers2);
        Car c2 = new Car(d3, passengers1);
        Vehicle v3 = new Car(d3, passengers2);
        System.out.println("inheritance.Vehicle case");
        v1.display();
        System.out.println("\nToo young driver case");
        v2.display();
        System.out.println("\nNo license driver case");
        c1.display();
        System.out.println("\nToo many passengers case");
        c2.display();
        System.out.println("\nRegular case");
        v3.display();
    }
}
