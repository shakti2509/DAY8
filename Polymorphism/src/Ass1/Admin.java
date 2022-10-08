package Ass1;

public class Admin extends Employee {
	private double bonus;

	public Admin(String name, String add, int eid, double salary, double bonus) {
		super(name, add, eid, salary);
		this.bonus = bonus;
	}

	public Admin() {
		super();
	}
	public double calsalary()
	{ return (salary+bonus);
		
	}

	
	public String toString() {
		return "Admin [bonus=" + bonus + ", eid=" + eid + ", salary=" + salary + ", calsalary()=" + calsalary()
				+ "address                   "+add+  "name             "+name+"]";	}
	

}
