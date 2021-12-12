
public class RresnickE04a {

	public static void main(String[] args) {

		Square square = new Square( 5 );
		System.out.printf( "The area of the square %d%n", 
				square.calculateArea());
		System.out.printf( "The perimeter of the square %d%n", 
				square.calculatePerimeter());
		
		Rectangle rectangle = new Rectangle( 5, 20 );
		System.out.printf( "The area of the rectangle %d%n", 
				rectangle.calculateArea());
		System.out.printf( "The perimeter of the rectangle %d%n", 
				rectangle.calculatePerimeter());

		// Rectangle that is 5 x 10
		double areaRectangle = Rectangle.calculateArea(5, 10);
				
		// Square that is 10
		double areaSquare = Square.calculateArea(10);
		
		if( areaRectangle > areaSquare ) {
			System.out.printf( "The area of the rectangle is %f units larger then the area of the square.",
					areaRectangle-areaSquare);
		} else if( areaRectangle < areaSquare ) {
			System.out.printf( "The area of the square is %f units larger then the area of the rectangle.",
					areaSquare-areaRectangle); 
		} else {
			System.out.print("The area of the square and the rectangle are the same");
		}
		
		
		
		
		
	}

}
