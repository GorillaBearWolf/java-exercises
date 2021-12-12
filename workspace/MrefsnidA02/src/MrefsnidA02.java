import java.util.Scanner;

/**
 * @author  Matthew Refsnider
 * @course  ISM3230 - Spring 2017
 * @email   mrefsnid@fau.edu
 */

public class MrefsnidA02 {
    
    /**
    * @param args
    */
    
	// Homework assignment #2
    // start method main
    public static void main(String[] args) {
    /**
	 * main method reads and stores input from user then calculates perimeter 
	 * of a rectangle and square, area and circumference of a circle, and area 
	 * of a rectangle and square.
	 */		
		// create new Scanner object that uses System.in
		Scanner input = new Scanner(System.in);
		
		// prompt and read for height and width of a rectangle
		System.out.println("Enter height and width of a rectangle...");
			System.out.print("Height: ");
				float rHeight = input.nextFloat();
			System.out.print("Width: ");
				float rWidth = input.nextFloat();
				
			// calculate perimeter
			float rectanglePerimeter = rHeight * 2 + rWidth * 2;
		
			// print perimeter using printf
			System.out.printf("Perimeter of the Rectangle is %f%n%n", 
					rectanglePerimeter);
		
		// prompt and read for height and width of a square
		System.out.println("Enter height and width of a square...");
			System.out.print("Height: ");
				float sHeight = input.nextFloat();
			System.out.print("Width: ");
				float sWidth = input.nextFloat();
				
			// calculate perimeter
			float squarePerimeter = sHeight * 2 + sWidth * 2;
		
			// print perimeter using printf
			System.out.printf("Perimeter of the Square is %f%n%n", 
					squarePerimeter);
			
		// prompt and read for radius of a circle
		System.out.println("Enter radius of a circle...");
			System.out.print("Radius: ");
				float cRadius = input.nextFloat();
				
			// calculate area
			float circleArea = (float) (cRadius * cRadius * 3.14);
		
			// print area using printf
			System.out.printf("Area of the Circle is %f%n%n", 
					circleArea);
			
		// prompt and read for diameter of a circle
		System.out.println("Enter diameter of a circle...");
			System.out.print("Diameter: ");
				float cDiameter = input.nextFloat();
				
			// calculate circumference
			float circleCircumference = (float) (cDiameter * 3.14);
		
			// print circumference using printf
			System.out.printf("Circumference of the Circle is (%f) * 3.14 = %f%n%n", 
					cDiameter,circleCircumference);
			
					// prompt and read for height and width of a rectangle
		System.out.println("Enter height and width of a rectangle...");
			System.out.print("Height: ");
				float rHeight2 = input.nextFloat();
			System.out.print("Width: ");
				float rWidth2 = input.nextFloat();
				
			// calculate area
			float rectangleArea = (float) (rHeight2 * rWidth2);
			
			// print area using printf
			System.out.printf("Area of the Rectangle is %f * %f = %f%n%n",
					rHeight2,rWidth2,rectangleArea);
			
		// prompt and read for height and width of a square
		System.out.println("Enter height and width of a square...");
			System.out.print("Height: ");
				float sHeight2 = input.nextFloat();
			System.out.print("Width: ");
				float sWidth2 = input.nextFloat();
		
		// calculate area
			float squareArea = (float) (sHeight2 * sWidth2);		
			
			// print area using println
			System.out.println("Area of the Square is"+" "+sHeight2+" * "+
					sWidth2+" = "+squareArea+"\n");
			
		input.close(); // close Scanner input
			
	}// end method main

} // end class MrefsnidA02