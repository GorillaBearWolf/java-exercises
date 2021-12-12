
public class Square {
	
	private int height;
	
	public Square() { }
	
	public Square( int height ) {
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public int calculateArea() {
		return height * height;	
	}
	
	public int calculatePerimeter() {
		return height * 4;
	}
	
	public static double calculatePerimeter( double h ) {
		return h * 4;
	}
	
	public static double calculateArea( double h ) {
		return h * h;
	}

}
