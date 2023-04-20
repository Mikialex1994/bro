package staticmodifyer;

public class Static {

	String name;
	static int num;
	
	Static(String name) {
		
		this.name = name;
		num++;
	}
	
	static void games() {
		
		System.out.println("This " + num + " are the game that i like ");
	}
	
}
