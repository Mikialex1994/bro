package nestedforloop;

import java.util.Scanner;

public class nested {

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int row; 
		int colum; 
		String symbol;
		System.out.println("This is what nested loops are lookes like ");
		System.out.println("Inter the row");
		 row = scanner.nextInt();
		System.out.println("Inter the colums ");
		 colum = scanner.nextInt();
		System.out.println("IN what symbole you want me print out for you");
		 symbol = scanner.next();
		
		     for(int i=1;i<=row;i++) {
		    	 System.out.println();
		    	 for(int j=1;j<=colum;j++) {
		    		 System.out.print(symbol);
		    	 }
		    	 
		     }
		
		
	}
}
