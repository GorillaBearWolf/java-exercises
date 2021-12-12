
/**
 * @author mrefsnid
 * @assignment Homework 4
 */

// imports
import java.util.Scanner;
import java.lang.Math;

// declare class
public class Circle {
	
/*
 * declare parameters
 */
	private double r;
/*
 * constructor
 */
	public Circle() {
		r = 0;
	}
	
/*
 * setters/getters	
 */
	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

/*
 * primary methods
 */
	// calc circumference
	public double circumference() {
		return (r * (2 * Math.PI));
	}

	// calc area
	public double area() {
		return (Math.PI * (r * r));
	}

/**
 * @param args
 * 
 * method main instantiates objects input and circle,
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
			
			// create circle
			Circle circle = new Circle();
			
			// prompt/read radius and set r
			System.out.print("Enter radius of circle "+i+": ");
				double radius = input.nextInt();
					circle.setR(radius);
			
			// print return of circumference
			System.out.printf("...\nThe circumference of circle "+i+" is %f.\n", circle.circumference());
			
			// print return of area
			System.out.printf("The area of circle "+i+" is %f.\n\n", circle.area());
			
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

} // end class Circle
