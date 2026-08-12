package Polumorphism;

import java.util.Scanner;

public class PolymorphismSample {

	public static void main(String[] args) {
		
		Pet pet; //Declare variable of Pet interface
		
		System.out.println("Please pick either a CAT or a Dog to play with you.");
		System.out.println("1:Cat 2:Dog(type 1 or 2 and Enter): ");
		
		Scanner sc = new Scanner(System.in);
		
		String inputStr = sc.nextLine();
		int inputNum = Integer.parseInt(inputStr);
		
		pet = new Cat();
			
		if(inputNum == 1){
			pet = new Cat();
			System.out.println("You chose a cat.");
		}else if(inputNum == 2){
			pet = new Dog();
			System.out.println("You chose a dog");
		}else {
			System.out.println("You typed wrongly so that we chose a cat");
			
		}//end if loop		
		System.out.println("Let's feed your pet!");
		pet.eat();
		
		System.out.println("Let's play with your pet!");
		pet.playToy();
		
		

	}

}
