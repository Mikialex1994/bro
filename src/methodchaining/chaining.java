package methodchaining;

public class chaining {

	
	public static void main(String[] args) {
		
		
		String name = "Miki";
	//name = name.concat(" Alex");
		//name.trim();
		
		name=name.concat(" Alex").trim().toUpperCase();
		
		
		
		
		
		System.out.println(name);
		
	}
}
