import java.util.Scanner;

public class MrefsnidE04a {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Square square = new Square(); // instantiate a square
		
		System.out.print("Enter the height of the square: ");
		int squareHeight = input.nextInt();
		
		square.setHeight(squareHeight);
		
		System.out.printf("%nThe area of the square is %d%n%n", 
				square.calculateArea());
		System.out.printf("The perimeter of the square is %d%n%n", 
				square.calculatePerimeter());
		
		Rectangle rectangle = new Rectangle ( 5 , 20 );
		System.out.printf("The area of the rectangle is %d%n%n", 
				rectangle.calculateArea());
		System.out.printf("The perimeter of the rectangle is %d%n%n", 
				square.calculatePerimeter());
		
		input.close();
		
		// Rectangle that is 5 x 10
		double areaRectangle = Rectangle.calculateArea(5, 10);
		
		
		// Square that is 10
		double areaSquare = Square.calculateArea(10);
		
		if( areaRectangle > areaSquare ) {
			// Print something
			System.out.printf("The area of the rectangle is %f units larger than the area of the square.%n%n",
					areaRectangle-areaSquare);
			
		} else if( areaRectangle < areaSquare ) {
			// Print something
			System.out.printf("The area of the square is %f units larger than the area of the rectangle.%n%n",
					areaSquare-areaRectangle);
			
		} else {
			// Print equal
			System.out.printf("The areas are the same %f = %f%n%n",
					areaSquare,areaRectangle);
		
		}

	}

}
