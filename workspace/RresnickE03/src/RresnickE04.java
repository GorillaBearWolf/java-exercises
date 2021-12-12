
public class RresnickE04 {

	public static void main(String[] args) {

		Marker brownMarker = new Marker( 3,
				"Brown", 100, false );
				
		
		// Open the marker!!!!
		brownMarker.open();
		
		// Now write a few times with the marker
		brownMarker.write();
		brownMarker.write();
		brownMarker.write();
		brownMarker.write();
		brownMarker.write();
		
		// Close the marker
		brownMarker.close();
		
		System.out.println( brownMarker );
		
		
		
				
		
		
		
		
		
		

	}

}
