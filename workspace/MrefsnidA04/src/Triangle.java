
/**
 * @author mrefsnid
 * @assignment Homework 4
 */

// imports
import java.util.Scanner;

// declare class
public class Triangle {
	
/*
 * declare parameters
 */
	private double a;
	private double b;
	private double c;
	private double base;
	private double height;
	
/*
 * constructor
 */
	public Triangle() {
		a = 0;
		b = 0;
		c = 0;
		base = 0;
		height = 0;
	}
	
/*
 * setters/getters
 */
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}
	
	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
/*
 * primary methods
 */
	// calc perimeter
	public double perimeter() {
		return a + b + c;
	}

	// calc area
	public double area() {
		return (height * base) / 2;
	}

/**
 * @param args
 * 
 * method main instantiates objects input and triangle,
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
			
			// create triangle
			Triangle triangle = new Triangle();
			
			// prompt/read sideA and set a
			System.out.print("Enter side A of triangle "+i+": ");
				double sideA = input.nextInt();
					triangle.setA(sideA);
			
			// prompt/read sideB and set b
			System.out.print("Enter side B of triangle "+i+": ");
				double sideB = input.nextInt();
					triangle.setB(sideB);
			
			// prompt/read sideC and set c
			System.out.print("Enter side C of triangle "+i+": ");
				double sideC = input.nextInt();
					triangle.setC(sideC);
			
			// prompt/read triangleHeight and set height
			System.out.print("Enter height of triangle "+i+": ");
				double triangleHeight = input.nextInt();
					triangle.setHeight(triangleHeight);
			
			// prompt/read baseLength and set base
			System.out.print("Enter base of triangle "+i+": ");
				double baseLength = input.nextInt();
					triangle.setBase(baseLength);

			// print return of perimeter
			System.out.printf("...\nThe perimeter of triangle "+i+" is %f.\n", triangle.perimeter());
			
			// print return of area
			System.out.printf("The area of triangle "+i+" is %f.\n\n", triangle.area());
			
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

} // end class Triangle
