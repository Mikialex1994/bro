package objpassing;

public class objmain {

	public static void main(String[] args) {
		
		obj1 o2 = new obj1();
		
		
		obj o = new obj("Miki");
		obj o1 = new obj("Alex");
		
		
		o2.family(o);
		o2.family(o1);
	}
	
}
