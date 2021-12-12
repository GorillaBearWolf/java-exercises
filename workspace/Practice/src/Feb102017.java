
public class Feb102017 {

	public static void main(String[] args) {
		
		/*
		 * Counting to 10.
		 */
		//int i = 0; 
		//while( i < 10 ) {
			//i++;
			//System.out.println( i );
		//}/
		
		/*
		 * Infinite loop break out on the 10th iteration
		 */
		int i = 0;
		while( true ) {
			i++;
			if( i < 10 ) {
				System.out.println( i );
			} else {
				System.out.println( "Break Out " + i);
				break;
			}
		}

		/* Do While loop example executing one time */
		do {
			System.out.println( "Execute one time");
		} while( false );
		
		/* For Loop Example */
		for( int j = 0; j < 10; j++ ) {
			System.out.println( j );
		}
		
		
	}

}
