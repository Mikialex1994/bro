package javainnerclasses;

public class Main {

	
	public static void main(String[] args) {
		
		innerclass in = new innerclass();
		innerclass.outerclass out = in.new outerclass();
		
		out.disPlay();
	}
}
