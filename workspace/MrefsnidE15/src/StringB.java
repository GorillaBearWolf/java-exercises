
public class StringB {
	
	public static void main(String[] args) {
		
		int i = 100;
		long start = System.nanoTime();
		appendString(i);
		long timer = System.nanoTime() - start;
		System.out.println("String appending took " + timer + " seconds");
	
		i = 100;
		start = System.nanoTime();
		appendStringBuilder(i);
		timer = System.nanoTime() - start;
		System.out.println("StringBuilder took " + timer + " seconds");
		
	}
	
	
	public static String appendString(int count) {
		String str = new String();
		for(int i = 0; i < count; i++) {
			str += "abcdefghijklmnopqrstuvwxyz\n";
		}
		
		return str;
		
	}
	
	public static String appendStringBuilder(int count) {
		StringBuilder str = new StringBuilder();
			for(int i = 0; i < count; i++) {
				str.append("abcdefghijklmnopqrstuvwxyz\n");
			}
			
			return str.toString();
	}
	
	
	

}
