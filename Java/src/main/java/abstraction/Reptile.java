package abstraction;

public class Reptile extends Vertabrate
{
    @Override
    public void eat() {
        System.out.println("Reptiles eat a lot of things!");
    }

    @Override
    public void makeNoise() {
        System.out.println("Reptiles are a quiet, stoic bunch");
    }
}
