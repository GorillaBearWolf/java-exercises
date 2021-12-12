
public abstract class SpriteAbstract implements SpriteInterface {

	private int x;
	private int y;
	
	public void move() {
		
	}

	@Override
	public boolean intersects(SpriteInterface sprite) {
		
		int s = 10;
		
		int s1ptlx = x;
		int s1ptly = y;
		
		int s1ptrx = x + s;
		int s1ptry = y;
		
		int s1pblx = x;
		int s1pbly = y + s;
		
		int s1pbrx = x + s;
		int s1pbry = y + s;
		
		int s2ptlx = x;
		int s2ptly = y;
		
		int s2ptrx = x + s;
		int s2ptry = y;
		
		int s2pblx = x;
		int s2pbly = y + s;
		
		int s2pbrx = x + s;
		int s2pbry = y + s;
		
		// Is point one of the sprite2 in sprite1
		if(s1ptlx < s2ptlx && s2ptlx < s1ptlx) {
			if(s1ptly < s2ptly && s2ptly < s1pbly)
				return true;
		}
		
		if(s1ptlx < s2ptrx && s2ptrx < s1ptlx) {
			if(s1ptly < s2ptly && s2ptly < s1pbly)
				return true;
		}
		
		if(s1ptlx < s2pblx && s2pblx < s1ptlx) {
			if(s1ptly < s2pbly && s2pbly < s1pbly)
				return true;
		}
		
		if(s1ptlx < s2pbrx && s2pbrx < s1ptlx) {
			if(s1ptly < s2pbry && s2pbry < s1pbly)
				return true;
		}
		
		return false;
		
		}


	@Override
	public int getX() {
		return x;
	}

	@Override
	public int getY() {
		return y;
	}

}
