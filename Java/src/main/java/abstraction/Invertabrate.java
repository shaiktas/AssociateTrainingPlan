package abstraction;

public class Invertabrate implements Animal
{

    @Override
    public void eat()
    {
        System.out.println("I am an invertabrate I eat a lot of different things");
    }

    @Override
    public void die()
    {
        System.out.println("I will die like an invertabrate");
    }

    @Override
    public void makeNoise()
    {
        System.out.println("I'm an invertabrate I don't make noise!");
    }

    public boolean haveSpine()
    {
        return false;
    }
}
