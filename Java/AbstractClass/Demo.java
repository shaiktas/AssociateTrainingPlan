package AbstractClass;

abstract class Animal {
	abstract public String greeting();
}

class Cat extends Animal {
	@Override
	public String greeting() {
		return "Hi! This is a cat.";
	}
}

class Dog extends Animal {
	@Override
	public String greeting() {
		return "Hi! This is a dog.";
	}
}

class Rat extends Animal {
	@Override
	public String greeting() {
		return "Hi! This is a rat.";
	}
}

public class Demo {

	public static void main(String[] args) {
		Cat cat = new Cat();
		System.out.println(cat.greeting());
		Dog dog = new Dog();
		System.out.println(dog.greeting());
		Rat rat = new Rat();
		System.out.println(rat.greeting());
	}

}
