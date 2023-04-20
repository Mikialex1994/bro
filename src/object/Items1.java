package object;

import java.util.Arrays;

public class Items1 {

	
	  String[] food = {"Steak","Chicken","Rice"};
	  

	  
	  double[] price = {10.23,8.52,3.41};
	 
	  
	 public void menu (String[] food , double[] price) {
		 
		 this.food=food;
		 this.price=price;
		 
		 System.out.println(Arrays.toString(food));
		 System.out.println(Arrays.toString(price));
		 
	 }
	  
	  public String[] getFood () {
		  
		  return food;
	  }
	  
	  public void  menu1() {
		  
		  for (String string : food) {
			  System.out.printf(string+ "\t");
			
		}
		  System.out.println("\n");
		  for (double d : price) {
			System.out.print(d+ "\t");
		}
	  }
	
}