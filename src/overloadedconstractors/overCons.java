package overloadedconstractors;

public class overCons {

	
	String car;
	int year;
	String color;
	
	
	overCons(String car , int year) {
		
		this.car = car;
		this.year = year;
		
		
	}
	
	// this is over loaded contractor
	
	overCons(String car , int year, String color) {
		this.car = car;
		this.year = year;
		this.color = color;
		
	}
	
}
