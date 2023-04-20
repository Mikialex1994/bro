package supermain;

public class sup2 extends sup1 {

	String club; 
	
	sup2(String name , int age , String club){
		super(name,age);
		
		
		this.club=club;
		
		
		
	}
	public String toString() {
		return super.toString() + this.club ;
		
	}
	
}
