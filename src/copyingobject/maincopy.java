package copyingobject;

public class maincopy {

	
	public static void main(String[] args) {
		
	
	copy c1 = new copy("Miki","Locate",17);
	copy c2 = new copy("Alex","Human resource",25);
	
	c1.car(c2);
	
	System.out.println(c1);
	System.out.println(c2);
	System.out.println();
	
	 
	System.out.println(c1.getName());
	System.out.println(c1.getWork());
	System.out.println(c1.getSalary());
	
	System.out.println();
	System.out.println(c2.getName());
	System.out.println(c2.getWork());
	System.out.println(c2.getSalary());
	
	
	
	
	
	
	
	
	
	
	
	//System.out.println(c1.name.toString());
	//System.out.println(c1.work.toString());
	//System.out.println(c1.toString() );
	}
}
