package abstraction;

public class Bird extends Vertabrate
{
    @Override
    public void eat() {
        System.out.println("Birds eat insects, seeds, or other birds sometimes");
    }

    @Override
    public void makeNoise() {
        System.out.println("Birds make tweet tweet noises!");

    }
}
