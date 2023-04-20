package timertask;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;


public class timer {

	public static void main(String[] args) {
		
		Timer time = new Timer();
		TimerTask task = new TimerTask() {

		int counter = 10;	
			@Override
			public void run() {
				
				if (counter > 0) {
					System.out.println(counter );
					counter--;
				} else {
System.out.println("Happy new Year");
time.cancel();
				}
				
				// TODO Auto-generated method stub
		//	System.out.println("Task5 Completed");
				
			}
			
			
		};
		
		//time.schedule(task, 3000);
		
		Calendar date = Calendar.getInstance();
		date.set(Calendar.YEAR,2023);
		date.set(Calendar.MONTH,Calendar.MARCH);
		date.set(Calendar.DAY_OF_MONTH,04);
		date.set(Calendar.HOUR_OF_DAY, 1);
		date.set(Calendar.MINUTE, 39);
		date.set(Calendar.SECOND,0);
		date.set(Calendar.MILLISECOND, 0);
		
		time.schedule(task, date.getTime(),1000);
		
		//time.scheduleAtFixedRate(task,0 , 1000);
		
		 
	}
}
