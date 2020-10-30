package abstraction;

public class Mammal extends Vertabrate
{
    @Override
    public void eat() {
        System.out.println("Mammals can eat plants, other animals, or both!");
    }

    @Override
    public void makeNoise() {
        System.out.println("Mammals can make a lot of different noises!");
    }
}
