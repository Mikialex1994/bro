package Enum;

 enum Weeks {

	MONDAY(1),
	TUESDAY(2),
	WEDNESDAY(3),
	THURSDAY(4),
	FRIDAY(5),
	SATERDAY(6),
	SUNDAY(7);
	 
	 int num;
	 Weeks(int num) {
		this.num = num; 
		 
	 }

	
}

 public class Main{
	
	 public static void main(String[] args) {
		
	Weeks week =  Weeks.MONDAY;	 
		firstDay(week); 
	}
	 
	 static void firstDay(Weeks week) {
		 
		 switch(week) {
		 case MONDAY:
			 
			System.out.println("The first day of the week is monday" + week.num );
		break;
		
		default:
			System.out.println("no this is not the first day of the week");
			 break;
		 
		 }
	 }
		
	}
