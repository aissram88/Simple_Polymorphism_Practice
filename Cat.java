package Polymorphism;

public class Cat implements Pet {

	@Override
	public void eat() {
		eat("Cat Food");
			
	}

	@Override
	public void eat(String food) {
		System.out.println("I will eat "+ food+". Meow!");
		System.out.println("Yummy Meow!");

	}

	@Override
	public void playToy() {
		playToy("Toy");

	}

	@Override
	public void playToy(String toy) {
		System.out.println("I will play with "+ toy+". Meow!");
		System.out.println("I am hungry! Meow.");
	}

}
