
/**
 * @author mrefsnid
 * @assignment Homework 4
 */

// imports
import java.util.Scanner;

// declare class
public class Rectangle {
	
/*
 * declare parameters
 */
	private int l;
	private int w;
	
/*
 * constructor
 */
	public Rectangle() {
		l = 0;
		w = 0;
	}
	
/*
 * setters/getters
 */
	public int getL() {
		return l;
	}

	public void setL(int l) {
		this.l = l;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

/*
 * primary methods
 */
	// calc perimeter
	public int perimeter() {
		return 2 * (l + w);
	}

	// calc area
	public int area() {
		return l * w;
	}

/**
 * @param args
 * 
 * method main instantiates objects input and rectangle,
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
			
			// create rectangle
			Rectangle rectangle = new Rectangle();
			
			// prompt/read length and set l
			System.out.print("Enter length of rectangle "+i+": ");
				int length = input.nextInt();
					rectangle.setL(length);
			
			// prompt/read width and set w
			System.out.print("Enter width of rectangle "+i+": ");
				int width = input.nextInt();
					rectangle.setW(width);
			
			// print return of perimeter
			System.out.printf("...\nThe perimeter of rectangle "+i+" is %d.\n", rectangle.perimeter());
			
			// print return of area
			System.out.printf("The area of rectangle "+i+" is %d.\n\n", rectangle.area());
			
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

} // end class Rectangle
