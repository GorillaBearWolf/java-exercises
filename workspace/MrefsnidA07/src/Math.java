
/**
 * 
 * @author mrefsnid Matthew Refsnider
 * @project Homework 7
 */

public class Math implements MathInterface {
	
	/**
	 * Calculation methods
	 */

	@Override
	public double add(double a, double b) {
		return a + b;
	}

	@Override
	public double subtract(double a, double b) {
		return a - b;
	}

	@Override
	public double divide(double a, double b) {
		return a / b;
	}

	@Override
	public double multiply(double a, double b) {
		return a * b;
	}

	@Override
	public double modulus(double a, double b) {
		return a % b;

	}

}
