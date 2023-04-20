package filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class file {

	
	public static void main(String[] args) throws IOException {
		
		
		FileWriter writer = new FileWriter("a.txt");
		
		writer.write("lksdkmlsdlksdc \n jnsahjsadcsbkjlsadcjlsadb");
		writer.append("ksncjsand");
		
		writer.close();
		
	}
}
