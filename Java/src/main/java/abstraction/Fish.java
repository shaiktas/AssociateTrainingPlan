package abstraction;

public class Fish extends Vertabrate
{
    @Override
    public void eat() {
        System.out.println("Fish eat algae");
    }

    @Override
    public void makeNoise() {
        System.out.println("Fish don't have ANYTHING to say");
    }
}
