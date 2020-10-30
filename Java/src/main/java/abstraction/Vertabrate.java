package abstraction;

public abstract class Vertabrate implements Animal
{
    public boolean haveSpine()
    {
        return true;
    }

    @Override
    public void die()
    {
        System.out.println("No matter how we are built, death comes for all of us the same");
    }
}
