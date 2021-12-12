/**
 * 
 * @author mrefsnid Matthew Refsnider
 * @project Assignment 6
 */

public abstract class Animal {

	private String name;
	
	private String noise;
	
	private int legs;
	
	private int eyes;
	
	private int weight;
	
	private int length;
	
	private int height;
	
	private int position;
	
	
	/**
	 * To be implemented by each animal, defines how that animal
	 * moves and sounds in the game
	 */
	public abstract void move();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getNoise() {
		return noise;
	}

	public void setNoise(String noise) {
		this.noise = noise;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public int getEyes() {
		return eyes;
	}

	public void setEyes(int eyes) {
		this.eyes = eyes;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int pos) {
		this.position = pos;
	}
	
	
}
