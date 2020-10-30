package abstraction;

public class Amphibian extends Vertabrate
{
    @Override
    public void eat() {
        System.out.println("Amphibians eat insects!");

    }

    @Override
    public void makeNoise() {
        System.out.println("Ribbit ribbit!");
    }
}
