package file;

import java.io.File;

public class file {

	public static void main(String[] args) {
		
		File file = new File("a.txt.txt");
		
		System.out.println(file.exists());
		System.out.println(file.isFile());
		file.delete();
	}
	
}
