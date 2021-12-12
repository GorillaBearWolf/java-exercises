
public interface SpriteInterface {
	
	public void up();
	public void down();
	public void left();
	public void right();
	
	public boolean intersects(SpriteInterface sprite);
	
	public SpriteInterface fireMissile();
	
	public int getX();
	public int getY();
}
