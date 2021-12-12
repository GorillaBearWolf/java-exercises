
/**
 * @author mrefsnid
 * @assignment Homework 4
 */

// imports
import java.util.Scanner;

// declare class
public class Square {
	
/*
 * declare parameters
 */
	private int s;	
	
/*
 * constructor
 */
	public Square() {
		s = 0;
	}
	
/*
 * setters/getters
 */
	public int getS() {
		return s;
	}

	public void setS(int s) {
		this.s = s;
	}
	
/*
 * primary methods
 */
	// calc perimeter
	public int perimeter() {
		return 4 * s;
	}

	// calc area
	public int area() {
		return s * s;
	}

/**
 * @param args
 * 
 * method main instantiates objects input and square,
 * prompts/reads input from user, 
 * sets parameters,
 * calls and prints return of primary method,
 * loops 5 times, 
 * prints statement after last iteration.
 */
	
	// start method main
	public static void main(String[] args) {
		
		// create input
		Scanner input = new Scanner(System.in);
		
		// init counter
		int i = 1;
		
		// begin do/while loop
		do {
			
			// create square
			Square square = new Square();
			
			// prompt/read sideA and set a
			System.out.print("Enter side of square "+i+": ");
				int side = input.nextInt();
					square.setS(side);
					
			// print return of perimeter
			System.out.printf("...\nThe perimeter of square "+i+" is %d.\n", square.perimeter());
			
			// print return of area
			System.out.printf("The area of square "+i+" is %d.\n\n", square.area());
			
			// increase counter
			i++;
			
			// ending if statement
			if (i == 6) {
				System.out.print("End of loop.");
			}
			
		} while (i < 6); // while condition

		// close input
		input.close();
		
	} // end method main

} // end class Square
