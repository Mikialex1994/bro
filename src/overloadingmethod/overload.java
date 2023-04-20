package overloadingmethod;

public class overload {

	static String name(String Name) {
		System.out.println("this is the first method" );
		return Name;
		
	}
	
	static String name(String Name, String name) {
		System.out.println("This is overload method");
		return name + Name;
		
	}
	
	
	static int age(int num,int date) {
		System.out.println("this is the first method");
		return num + date;
		
	}
	static int age(int num) {
		
		System.out.println("this is the overload method");
		return num;
	}
	
	public static void main(String[] args) {
		
		String Name = "Miki";
		String name = "Alex";
		
		int num = 21;
		int date = 60;
		
		age(num,date);
		 int z =  num + date;
		 
		 System.out.println(z);
		
		 
		 name(name,Name);
		
		
		
		
		
	}
	
	
	
}
