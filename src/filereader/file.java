package filereader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class file {

	
	public static void main(String[] args) throws IOException {
		
		
		FileReader reader = new FileReader("a.txt");
		int data = reader.read();
		while(data != -1) {
			System.out.println((char)data);
		data=reader.read();
		}
		reader.close();
		
	}
}
