public class Marker {
	/*
	 * Declare variables
	 */
	private int length;
	private String color; // String is caps because it is an object
	private int percentUsed;
	private boolean opened;
	
	/*
	 * Default constructor:
	 * Instantiates the class without
	 * having to pass parameters
	 */
	 public Marker () { } 
		
	/* 
	 * A constructor that passes parameters
	 */
	public Marker ( int length, 
			String color, 
			int percentUsed, 
			boolean opened ) {		
		
		this.length = length; // "this" means the current object
		this.color = color;
		this.percentUsed = percentUsed;
		this.opened = opened;		
	}

	/*
	 * Copy constructor: clones or copies the class
	 */
	public Marker( Marker marker ) {		
		this.length = marker.length;
		this.color = marker.color;
		this.percentUsed = marker.percentUsed;
		this.opened = marker.opened;		
	}

	
	/* 
	 * You never have to write your own setters and getters
	 * go to Source > Generate Setters and Getters
	 */
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPercentUsed() {
		return percentUsed;
	}

	public void setPercentUsed(int percentUsed) {
		this.percentUsed = percentUsed;
	}

	public boolean isOpened() {
		return opened;
	}

	public void setOpened(boolean opened) {
		this.opened = opened;
	}

	public void write () {	
		if (opened) {		
			percentUsed --; //short hand to subtract 1 from percentUsed
			}
	
		}

	public void open () {	
		opened = true;	
		}

	public void close () {	
		opened = false;
		}

	@Override
	public String toString() {
		return "Marker [length=" + length + ", color=" + color + ", percentUsed=" + percentUsed + ", opened=" + opened
				+ "]";
	}

}
