/**
 * 
 * @author mrefsnid Matthew Refsnider
 * @project Assignment 6
 */

import java.util.ArrayList;

public class MrefsnidA06 {

	public static void main(String[] args) throws InterruptedException {

		char[] c = { '~', '<', '>', '#' };
		
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(new Wolf());
		animals.add(new Monkey());
		animals.add(new Frog());
		// Make more animals
		// Add them to the array
		// Run the game
		
		
		System.out.println("The race characters are:\n");
		
		
		// Print the name of the two animals
		for(Animal animal : animals) {
			System.out.println(animal.getName());
		}
		
		System.out.println();
		Thread.sleep(3000); // Pause for 3 seconds
		
		int lengthOfRace = 20;
		boolean gameOver = false;
		while(!gameOver) {
			for(Animal animal : animals) {
				animal.move();
				if(animal.getPosition() >= lengthOfRace) {
					System.out.println();
					System.out.print(animal.getName() + " wins...\n\n" + animal.getNoise());
					gameOver = true;
					break;
				} else {
					System.out.println(animal.getName() + " position " + animal.getPosition());
					for(int i = 0; i < animal.getPosition(); i++) {
						System.out.print(c[i % c.length ]);
					}
					System.out.println();
				}
				
			}
			
			System.out.println();
			Thread.sleep(1000); // Pause for 1 second
		}
		
	}

}
