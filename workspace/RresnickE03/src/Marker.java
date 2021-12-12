
public class Marker {

	
	private int length;
	private String color;
	private int percentUsed;
	private boolean opened;
	
	/**
	 * Default Constructor
	 */
	public Marker() { }
	
	public Marker( int length, 
			String color,
			int percentUsed,
			boolean opened ) {
		
		this.length = length;
		this.color = color;
		this.percentUsed = percentUsed;
		this.opened = opened;
			
	}
	
	/**
	 * Copy constructor clones or copies the class
	 */
	public Marker( Marker marker ) {
		
		this.length = marker.length;
		this.color = marker.color;
		this.percentUsed = marker.percentUsed;
		this.opened = marker.opened;
		
	}

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
	
	
	
	
	public void write( ) {
		if( opened ) {
			percentUsed--;
		}
	}
	
	
	public void open() {
		opened = true;
	}
	
	
	public void close() {
		opened = false;
	}

	@Override
	public String toString() {
		return "Marker [length=" + length + ", color=" + color + ", percentUsed=" + percentUsed + ", opened=" + opened
				+ "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
