package dynamicpolymorphism;

import java.util.Scanner;

public class dynamicmain {

	
	public static void main(String[] args) {
		
		/*Scanner scanner = new Scanner(System.in);
		
		System.out.println("Which soda you like more");
		System.out.println("1:sprite");
		System.out.println("2:coke");
		boolean run = true;
		 String option= scanner.next();
		
		switch(option) {
		case "1": 
			soda s1 = new sprite();
		s1.taste();
			break;
			
		case "2":
			soda s2 = new coke();
			s2.taste();
			break;
		default :
			while(run) {
				System.out.println("Wrong choise try again");
				option = scanner.next();
				
				run=false;
			
		}
		
	}
	}
	}*/
		
		
		
		/*Scanner scanner = new Scanner(System.in);
		boolean validInput = false;
		soda s = null;

		while (!validInput) {
		    System.out.println("Which soda do you like more?");
		    System.out.println("1: Sprite");
		    System.out.println("2: Coke");
		    
		    String option = scanner.next();
		    switch (option) {
		        case "1":
		            s = new sprite();
		            validInput = true;
		            break;
		        case "2":
		            s = new coke();
		            validInput = true;
		            break;
		        default:
		            System.out.println("Wrong choice. Please try again.");
		            break;
		    }
		}

		s.taste();*/
		
		
		
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		boolean run = false;
		
		soda s = null;
		
		while(!run) {
			
			System.out.println("Whats your favorite soda");
			System.out.println("1: Sprite or 2: Coke");
			int x = scanner.nextInt();
			
			switch(x) {
			
			case 1:
				
				s = new sprite();
				run = true;
				break;
				
			case 2:
				
				s = new coke();
				run = true;
				break;
			default:
				System.out.println("Wrong choise try again");
				break;
				
			
			}
			
		}
		
		s.taste();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
