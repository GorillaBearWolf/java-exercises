
public interface Boat {
	
	public double getMass();
	public void setMass(double mass);
	
	public double getMaxDisplacement();
	public void setMaxDisplacement(double maxDP);
	
	public double getCapacity();
	public void setCapacity(double capacity);
	
	public double getLength();
	public void setLength(double length);
	
	public double getBeam();
	public void setBeam(double beam);
	
	public double getCurrentDisplacement();
	public void setCurrentDisplacement(double displacement);
	
	public boolean overMaxCapacity();
	
	public boolean isOverMaxDisplacement();
}