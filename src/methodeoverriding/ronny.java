package methodeoverriding;

public class ronny extends Arnoled {

	
	@Override
	public void Chest() {
		
		System.out.println("Arnoled is right about " + biceps);
	}
	public void years(int year) {
		
		this.year=year;
	}
	
	public int getYears() {
		return year;
	}
	public void sayYears() {
		
		System.out.println("The year of the compition is: " + getYears());
	}
}
