
public class BadGuy extends SpriteAbstract {
	
	private boolean up;
	private boolean down;
	private boolean left;
	private boolean right;
	
	private int x;
	private int y;

	@Override
	public void up() {
		up = true;
		down = false;
		left = false;
		right = false;
	}

	@Override
	public void down() {
		up = false;
		down = true;
		left = false;
		right = false;
	}

	@Override
	public void left() {
		up = false;
		down = false;
		left = true;
		right = false;
	}

	@Override
	public void right() {
		up = false;
		down = false;
		left = false;
		right = true;
	}
	
	@Override
	public SpriteInterface fireMissile() {
		return new Missile();

	}
	
}
