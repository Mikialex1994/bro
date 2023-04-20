package javamultithreading;

public class tread {

	public static void main(String[] args) throws InterruptedException {
		
	
	MyThread thread = new MyThread();

	MyRunnable runnable1 = new MyRunnable();
	Thread thread1 = new Thread(runnable1);
	
	
	thread.start();
	thread.join(3000);
	thread1.start();
	
	}
}
