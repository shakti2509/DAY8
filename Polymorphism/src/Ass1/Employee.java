package Ass1;

public class Employee extends Person {
	protected int eid;
	protected double salary;
	public Employee() {
		super();
	}
	public Employee(int eid, double salary) {
		super();
		this.eid = eid;
		this.salary = salary;
	}
	public Employee(String name, String add, int eid, double salary) {
		super(name, add);
		this.eid = eid;
		this.salary = salary;
	}
	
	

}
