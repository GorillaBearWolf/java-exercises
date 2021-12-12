
public class Rectangle {
	
private int height;
private int width;
	
	public Rectangle() { } // default constructor
	
	public Rectangle( int height, int width ) { // custom constructor
		this.height = height;
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getLength() {
		return width;
	}

	public void setLength(int width) {
		this.width = width;
	}

	public int calculateArea() {
		return height * width;	
	}
	
	public int calculatePerimeter() {
		return height * 2 + width * 2;
	}
	
	/**
	 * 
	 * @param h
	 * @param w
	 * @return
	 */
	
	public static double calculatePerimeter( double h, double w ) {
		return h * 2 + w * 2;
	}
	
	/**
	 * 
	 * @param h
	 * @param w
	 * @return
	 */
	
	public static double calculateArea( double h, double w ) {
		return h * w;
	}

}
