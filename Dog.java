package Polumorphism;

public class Dog implements Pet {

	@Override
	public void eat() {
		eat("Dog food");

	}

	@Override
	public void eat(String food) {
		System.out.println("I will eat "+ food+". Woof!");
		System.out.println("I'm full Woof!");

	}

	@Override
	public void playToy() {
		playToy("Toy");
	}

	@Override
	public void playToy(String toy) {
		System.out.println("I will play with "+ toy+". Woof!");
		System.out.println("I am hungry! Woof");
	}

}
