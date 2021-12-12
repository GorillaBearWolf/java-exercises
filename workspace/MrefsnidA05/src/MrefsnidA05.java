import java.util.Scanner;

public class MrefsnidA05 {

	public static void main(String[] args) {
		
		float[] array = new float[10];

		fillArray(array);
		
		addArray(array);
		
		subArray(array);
		
		multiplyArray(array);
		
		divideArray(array);
		
		System.out.println();
		
		System.out.println(addArray(array));
		
		System.out.println(subArray(array));
		
		System.out.println(multiplyArray(array));
		
		System.out.print(divideArray(array));
	}

	private static void fillArray(float[] array) {
		int length = array.length;
		Scanner arrayInput = new Scanner(System.in);
		
		System.out.println("NOTE: Output is determined by input order!\n");
		
		for( int i = 0; i < length; i++) {
			System.out.print("Enter number " + (i + 1) + "... ");
			array[i] = arrayInput.nextFloat();
		}
		
		arrayInput.close();
	}
	
	private static String addArray(float[] array) {
		int length = array.length;
		float sum = array[0]; // Initialize to first element in array
		
		for(int i = 1; i < length; i++) {
			sum += array[i];
		}
		
		return "The sum of the array is " + sum + ".\n";
	}
	
	private static String subArray(float[] array) {	
		int length = array.length;
		float diff = array[0]; // Initialize to first element in array
		
		for(int i = 1; i < length; i++) {
			diff -= array[i];
		}
		
		return "The difference of the array is " + diff + ".\n";
	} 
	
	private static String multiplyArray(float[] array) {
		int length = array.length;
		float prod = array[0]; // Initialize to first element in array
		
		for(int i = 1; i < length; i++) {
			prod *= array[i];
		}
		
		return "The product of the array is " + prod + ".\n";
	}
	
	private static String divideArray(float[] array) {
		int length = array.length;
		float quot = array[0]; // Initialize to first element in array
		
		for(int i = 1; i < length; i++) {
			quot /= array[i];
		}
		
		return "The quotient of the array is " + quot + ".\n";
	}
	
}