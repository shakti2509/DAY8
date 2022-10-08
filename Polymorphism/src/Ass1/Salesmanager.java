package Ass1;

public class Salesmanager extends Employee {
	private int target;
	private double incent;
	public Salesmanager() {
		super();
	}
	
	public Salesmanager(String name, String add, int eid, double salary, int target, double incent) {
		super(name, add, eid, salary);
		this.target = target;
		this.incent = incent;
	}
	
	public double calsalary()
	{ return (salary+incent);
		
	}

	@Override
	public String toString() {
		return "Salesmanager [target=" + target + ", incent=" + incent + "]"+"calsalry"+calsalary();
	}

	
	
	

}
