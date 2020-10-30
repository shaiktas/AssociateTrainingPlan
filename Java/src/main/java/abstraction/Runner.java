package abstraction;

public class Runner
{
    public static void main(String[]args)
    {
        System.out.println("Invertabrate");
        Invertabrate a1 = new Invertabrate();
        a1.makeNoise();
        a1.eat();
        a1.die();
        System.out.println("Spine?: " + a1.haveSpine());
        System.out.println("\nAmphibian");
        Animal a2 = new Amphibian();
        a2.makeNoise();
        a2.eat();
        a2.die();
        System.out.println("\nBird");
        Vertabrate v1 = new Bird();
        v1.makeNoise();
        v1.eat();
        v1.die();
        System.out.println("Spine?: " + v1.haveSpine());
        System.out.println("\nFish");
        Fish f1 = new Fish();
        f1.makeNoise();
        f1.eat();
        f1.die();
        System.out.println("\nMammal");
        Animal a3 = new Mammal();
        a3.makeNoise();
        a3.eat();
        a3.die();
        System.out.println("\nReptile");
        Reptile r1 = new Reptile();
        r1.makeNoise();
        r1.eat();
        r1.die();
    }
}
