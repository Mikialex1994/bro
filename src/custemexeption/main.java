package custemexeption;

import java.util.Scanner;

public class main {

	
	public static void main(String[] args) {
	
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your y");
		
		String s = scanner.nextLine().toUpperCase();
		
		
		try {
			
		checkS(s);
		
		}
		catch(Exception e) {
			System.out.println("A problem occured" + e);
		}
		
	}

	 static void checkS(String s) throws gException{
		
		if(!s.equals("M")&&!s.equals("F")) {
			
			
			
			throw new gException("\n" + "invalid try again");
			
		}
		else {
			System.out.println("w");
			
		}
	}
	
	
}
