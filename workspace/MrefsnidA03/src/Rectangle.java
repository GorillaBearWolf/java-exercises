
/**
 * @author Matthew Refsnider
 * @assignment Homework 3
 */

public class Rectangle {
/*	
	private double height;
	private double width;

	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;		
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
*/	
	
	// start method 
	public static double calculateRectanglePerimeter(double height, double width) {
		return height * 2 + width * 2;
	} // end method
	
	// start method 
	public static double calculateRectangleArea(double height, double width) {
		return height * width;
	} // end method
	
} // end class Rectangle
