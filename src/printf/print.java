package printf;

public class print {

	public static void main(String[] args) {
		
		boolean myBoolean = true; // we use %b
		String name = "Miki"; // we use %s
		int age = 21; // we use %d
		double num = 3.2; // we use %f
		char sign = '#'; // we use %c
		
		
		System.out.printf("this is %b\n",myBoolean);
		System.out.printf("my name is %10s\n",name);// 10 is the width
		System.out.printf("am %+d years old\n",age);
		System.out.printf("i have %.2f dollar\n", num);//.2 is how many digit that i want
		System.out.printf("i like %c this symbole\n" , sign);
		
		
	}
	
	
}
