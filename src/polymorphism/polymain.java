package polymorphism;

import java.util.Iterator;

public class polymain {

	public static void main(String[] args) {
		
	poly1 p1 = new poly1();
	poly2 p2 = new poly2();
	poly3 p3 = new poly3();
	
	poly1[] x = {p1,p2,p3};
	
	for (poly1 p : x) {
		p.run();
	}
	
	
	}
}
