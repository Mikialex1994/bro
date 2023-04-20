package javaThreads;

public class thread {
  public static void main(String[] args) throws InterruptedException {
	
	  /*System.out.println(Thread.activeCount());
	 
	  Thread.currentThread().setName("Mainnn");
	  System.out.println(Thread.currentThread().getName());*/
	  
	  
	  /*Thread.currentThread().setPriority(10);
	  System.out.println(Thread.currentThread().getPriority());
	  
	  System.out.println(Thread.currentThread().isAlive());*/
	  
	/*for(int i = 4; i > 0 ; i --) {
		System.out.println(i);
		Thread.sleep(1000);
		
	}*/
	  
	  mythread t = new mythread();
	  
	  t.start();
	  //System.out.println(t.isAlive());
	  
	 //System.out.println(t.getName());
	 //t.setName("2nd thread");
	 //System.out.println(t.getName());
	 
	 
	 //t.setPriority(1);
	 //System.out.println(t.getPriority());
	 
	 System.out.println(Thread.activeCount());
	// System.out.println(t.activeCount());
	 
	 
	  
	  
}
}
