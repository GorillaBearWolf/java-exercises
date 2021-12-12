import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Formatter;
import java.util.Scanner;

public class ReadAFile {

	public static void main(String[] args) throws IOException {
		
		Formatter formatter = new Formatter("input.txt");

		formatter.format("Hello World1\n");
		formatter.format("Hello World2\n");
		formatter.format("Hello World3\n");
		formatter.format("Hello World5\n");
		formatter.flush();
		
		File input = new File("input.txt");

		formatter.close();
		
		if(!input.exists()) {
			System.out.println((input.getName() + " does not exist."));
			return;
		}
		
		InputStream in = new FileInputStream(input);
		
		Scanner sin = new Scanner(in);
		
		while(sin.hasNext()) {

			System.out.println(sin.nextLine());
				
		}
		
		sin.close();
		in.close();
		
	}

}
