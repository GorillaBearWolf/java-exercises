import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Turing {

	public static void main(String[] args) {

		List<String> responses = new ArrayList();
		Scanner input = new Scanner(System.in);
		Random random = new Random(10);
		
		System.out.println( "Hi I'm Gary want to chat?" );
		
		while( true ) {
			
			System.out.print( "User Response: ");
			responses.add(input.nextLine());
			
			int i = random.nextInt(responses.size());
			System.out.println( "Gary: " + responses.get(i) );
			
		}
		
		
	}

}
