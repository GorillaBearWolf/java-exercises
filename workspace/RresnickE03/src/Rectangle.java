
public class Rectangle {

	
	private int height;
	private int width;
	
	public Rectangle() { }
	
	public Rectangle( int height, int width ) {
		this.height = height;
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
		
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int calculateArea() {
		return height * width;
	}
	
	public int calculatePerimeter() {
		return height * 2 + width * 2;
	}
	
	/**
	 * Example for your homework!!!
	 * 
	 * @param h
	 * @return
	 */
	public static double calculatePerimeter( double h, double w ) {
		return h * 2 + w * 2;
	}
	
	/**
	 * Example for your homework!!!
	 * @param h
	 * @return
	 */
	public static double calculateArea( double h, double w ) {
		return h * w;
	}
	
	
}
