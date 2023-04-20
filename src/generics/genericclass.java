package generics;



//-----Just to tell you-----\\
//
//  if you want to create a class like this too you can
//
//   public class genericclass(T extends Number, V>{
//   }
//    
//      In this number class int,double,float,long etc kind of number are included
//
//
//
///////////////////////////////
public class genericclass <T,V> {

	T x;
	V y;

	public genericclass(T x,V y) {
		
		this.x = x;
		this.y = y;
	}
/*public T getValue() {
	
	return x;
}*/
	
	
//--------This is not @Override am just lazy to change the method name------\\
	
	
	
public V getValue() {
	
	return y;
}


	
	
	
	
	
}
