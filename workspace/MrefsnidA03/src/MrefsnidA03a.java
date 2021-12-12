
/**
 * @author Matthew Refsnider
 * @assignment Homework 3
 */

// imports
import java.util.Scanner;
import static java.lang.Math.PI;

// declare class
public class MrefsnidA03a {
	
	/**
	 * @param args
	 *
	 * Reads inputs from user, passes data to static methods, then prints results
	 * Performs boolean operations on results and outputs desired string
	 */

	// start method main
	public static void main(String[] args) {
		
		// open input
		Scanner input = new Scanner(System.in);
/*
 * Perimeter of the Rectangle
 */
		// prompt and read rectangleHeight and rectangleWidth
		System.out.print("Input height: ");
			double rectangleHeight = input.nextDouble();
		System.out.print("Input width: ");
			double rectangleWidth = input.nextDouble();
		
		// call calculateRectanglePerimeter and store value in rectanglePerimeter
		double rectanglePerimeter = calculateRectanglePerimeter(rectangleHeight, 
				rectangleWidth);
		
		// print rectanglePerimeter
		System.out.printf("Perimeter of the Rectangle is %f%n%n", rectanglePerimeter);
/*
 * Perimeter of the Square	
 */
		// prompt and read squareWidth
		System.out.print("Input width: ");
			double squareWidth = input.nextDouble();
			
		// call method calculateSquarePerimeter and store value in squarePerimeter
		double squarePerimeter = calculateSquarePerimeter(squareWidth);

		// print squarePerimeter
		System.out.printf("Perimeter of the Square is %f%n%n", squarePerimeter);
/*
 * Area of the Circle	
 */
		// prompt and read circleRadius
		System.out.print("Input radius: ");
			double circleRadius = input.nextDouble();

		// call method calculateCircleArea and store value in circleArea
		double circleArea = calculateCircleArea(circleRadius);

		// print circleArea
		System.out.printf("Area of the Circle is %f%n%n", circleArea);
/*
 * Circumference of the Circle	
 */
		// prompt and read circleDiameter
		System.out.print("Input diameter: ");
			double circleDiameter = input.nextDouble();

		// call method calculateCircleCircumference and store value in circleCircumference
		double circleCircumference = calculateCircleCircumference(circleDiameter);

		// print circleCircumference
		System.out.printf("Circumference of the Circle is (%f) * 3.14 = %f%n%n", 
				circleDiameter, circleCircumference);
/*
 * Area of the Rectangle 		
 */
		// prompt and read rectangleHeight1 and rectangleWidth1
		System.out.print("Input height: ");
			double rectangleHeight1 = input.nextDouble();
		System.out.print("Input width: ");
			double rectangleWidth1 = input.nextDouble();

		// call method calculateRectangleArea and store value in rectangleArea	
		double rectangleArea = calculateRectangleArea(rectangleHeight1, rectangleWidth1);

		// print rectangleHeight1, rectangleWidth1, and rectangleArea
		System.out.println("Area of the Rectangle is "+rectangleHeight1+" * "+rectangleWidth1+
				" = "+rectangleArea+"\n");
/*
 * Area of the Square	
 */
		// prompt and read squareWidth1
		System.out.print("Input width: ");
		double squareWidth1 = input.nextDouble();

		// call method calculateSquareArea and store value in squareArea
		double squareArea = calculateSquareArea(squareWidth1);

		// print squareWidth1, squareWidth1, and squareArea
		System.out.println("Area of the Square is "+squareWidth1+" * "+squareWidth1+
				" = "+squareArea+"\n");
/*
 * Boolean operations		
 */
		if(squareArea > rectangleArea)
			System.out.printf("The square is %f units larger than the rectangle",
					squareArea-rectangleArea);
		else if(circleArea > rectangleArea)
			System.out.printf("The circle is %f units larger than the rectangle.", 
					circleArea-rectangleArea);
		else 
			System.out.printf("The rectangle is %f units larger than the rectangle.", 
					rectangleArea);
		
		// close input
		input.close();
		
	} // end method main
/*
 * static methods	
 */
	// start method
	public static double calculateRectanglePerimeter(double height, double width) {
		return height * 2 + width * 2;
	} // end method
	
	// start method
	public static double calculateRectangleArea(double height, double width) {
		return height * width;
	} // end method
	
	// start method
	public static double calculateSquarePerimeter(double width) {
		return width * 4;
	} // end method
	
	// start method
	public static double calculateSquareArea(double width) {
		return width * width;
	} // end method
	
	// start method
	public static double calculateCircleArea(double radius) {
		return PI * (radius * radius);
	} // end method
	
	// start method
	public static double calculateCircleCircumference(double diameter) {
		return PI * diameter;
	} // end method
	
} // end class MrefsnidA03a
