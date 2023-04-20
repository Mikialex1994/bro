






package generics;
public class generics {

	
	public static void main(String[] args) {
		
		
	/*	Integer[]intArray= {1,2,3,4,5,6};
		Double[]doubleArray= {5.5,2.2,3.3,1.1};
		Character[]charArray= {'q','d','f'};
		String[]stringArray= {"d","f","k"};	
		
	display(intArray);
	display(doubleArray);
	display(charArray);
	display(stringArray);*/
	
	
	
	
	
	
	
	
	
	//------------Generic Class--------------\\
	
	
	
	
	
		genericclass<Integer,String> player = new genericclass<>(1,"Coolllolololol");
		genericclass <Double,Integer>game = new genericclass<>(2.2,5);
		genericclass <String,Character>enemy = new genericclass<>("Killer",'@');
	
	
	System.out.println(player.getValue());
	System.out.println(game.getValue());
	System.out.println(enemy.getValue());
	
	
	
	}
	
	

	

/*	static<T>void display(T[] arr) {
		
		for (T t1 : arr) {
			System.out.print(t1 + "");
		}
		System.out.println();
	}*/
	
	
	}

	
	

