
/**
 * @author Matthew Refsnider
 * @assignment Homework 3
 */

import static java.lang.Math.PI;

public class Circle {	
/*
	private double radius;
	private double diameter;

	public Circle(double radius, double diameter) {
		this.radius = radius;
		this.diameter = diameter;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}
*/
	
	// start method 
	public static double calculateCircleArea(double radius) {
		return PI * (radius * radius);
	} // end method
	
	// start method 
	public static double calculateCircleCircumference(double diameter) {
		return PI * diameter;
	} // end method
	
} // end class Circle
