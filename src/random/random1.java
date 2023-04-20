package random;

import java.util.Random;

public class random1 {

	
	Random dice;
	int numbers;
	
	random1() {
		
		dice = new Random();
		
		
		roll();
		
	}
	
	public void roll() {
		
		numbers = dice.nextInt(10)+1;
		System.out.println(numbers);
		
		
	}
	
	
	
	
}
