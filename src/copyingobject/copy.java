package copyingobject;

public class copy {

	String name;
	String work;
	int salary; 
	
	 copy(String name, String work, int salary) {
			
			this.getName(name);;
			this.getWork(work);
			this.getSalary(salary);;
		}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	



/*	@Override
	public String toString() {
		return work + salary + name;
	}*/


	public void getName(String name) {
		this.name=name;
		
	}
	public void getWork(String work) {
		this.work=work;
		
	}
	public void getSalary(int salary) {
		this.salary=salary;
	}

	public void car(copy x) {
		this.setName(x.getName());
		this.setWork(x.getWork());
		this.setSalary(x.getSalary());
	}
	

	
}
