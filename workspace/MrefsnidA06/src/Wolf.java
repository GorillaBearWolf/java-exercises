/**
 * 
 * @author mrefsnid Matthew Refsnider
 * @project Assignment 6
 */

public class Wolf extends Animal {
	
	/*
	 * Constructor
	 */
	public Wolf() {
		setName( "th3 l0ne w0lf");
		setNoise("HOOOOOOWWWWWWWLLLLLLLLL");
		setEyes( 2 );
		setLegs( 4 );
		setWeight(90); // kg
		setPosition(1); 
	}
	
	/**
	 * Wolf moves 2 spaces every turn
	 */
	@Override
	public void move() {

		int pos = this.getPosition();
		
		pos += 2; // Incredible endurance
		
		this.setPosition( pos );
		
	}
	
}
