package method;

public class Methode {

	public static void main(String[] args) {
		
		String name = "Miki";
		
		
		Methode obj = new Methode();
		
		
		obj.getName(name);		
		obj.setAge(4);
		Methode.tellAge(obj);
	}
	
	
	



	int age;
	
	public void getName(String name) {
		
		System.out.println("Hello " + name );
	}
	
	 public void setAge(int age) {
		
		this.age=age;
	}
	
	public  int getAge() {
		return age ;
		
	}
	
	public static void tellAge(Methode obj) {
		
		System.out.println("You are " + obj.getAge() );
	}
}
