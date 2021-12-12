
/**
 * 
 * @author mrefsnid Matthew Refsnider
 * @project Homework 7
 */

public class Main {

	public static void main(String[] args) {
		
		MathInterface math = new Math();
		
		System.out.printf( "Add: 1 + 1 = %f%n", math.add( 1,  1) );
		System.out.printf( "Subtract: 1 - 1 = %f%n", math.subtract( 1,  1) );
		System.out.printf( "Multiply: 1 * 1 = %f%n", math.multiply( 1,  1) );
		System.out.printf( "Divide: 1 / 1 = %f%n", math.divide( 1,  1) );
		System.out.printf( "Modulus: 1 %% 1 = %f%n", math.modulus( 1,  1) );

	}

}
