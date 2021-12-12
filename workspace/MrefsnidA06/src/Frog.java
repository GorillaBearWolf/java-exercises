/**
 * 
 * @author mrefsnid Matthew Refsnider
 * @project Assignment 6
 */

public class Frog extends Animal {
	
	private int i = 0;
	
	/*
	 * Constructor
	 */
	public Frog () {
		setName( "Frogbert");
		setNoise("Ribbet ribbet.");
		setEyes( 2 );
		setLegs( 2 );
		setWeight(1); // kg
		setPosition(4);
	}
	
	/**
	 * Alternates between big and little hops
	 */
	public void move() {

		int pos = this.getPosition();
		
		if (i++ % 2 == 0) {
			pos += 3; // Big hop
		} else {
			pos += 1; // Little hop
		}
		
		this.setPosition( pos );
		
	}
	
}
