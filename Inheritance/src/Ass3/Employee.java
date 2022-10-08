package Ass3;

public class Employee {
	private int eid;
	private double salary;
	public Employee() {
		super();
	}
	public Employee(int eid, double salary) {
		super();
		this.eid=eid;
		this.salary = salary;
	}
	public String toString()
	{
		return "employe id is :  "+eid+"employe salary"+salary;
		
	}
}
