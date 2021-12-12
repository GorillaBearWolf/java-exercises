/**
 * 
 * @author mrefsnid Matthew Refsnider
 * @project Assignment 6
 */

public class Monkey extends Animal {
	
	private int i = 0;
	
	/*
	 * Constructor
	 */
	public Monkey () {
		setName( "A curious monkey");
		setNoise("OOH OOH, AAH AAH");
		setEyes( 2 );
		setLegs( 2 );
		setWeight(34); // kg
		setPosition(3);
	}
	
	/**
	 * Alternates moving forward 3 spaces and backwards 1 space
	 */
	@Override
	public void move() {

		int pos = this.getPosition();
		
		if (i++ % 2 == 0) {
			pos += 3;
		} else {
			pos -= 1; // The monkey gets distracted easily
		}
		
		this.setPosition(pos);
	}
	
}
