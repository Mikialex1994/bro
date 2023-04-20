package serialization;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		User user = new User();
		user.name = "Miki";
		user.password = "Alex";
		

   FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
	ObjectOutputStream out = new ObjectOutputStream(fileOut);	
	out.writeObject(user);
	out.close();
	fileOut.close();
		
	System.out.println("Object saved");
	
	}
}
