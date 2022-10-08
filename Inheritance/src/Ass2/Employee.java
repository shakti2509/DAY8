package Ass2;


public class Employee extends Person {
	private int eid;
	 private double salary;
	public Employee() {
		super();
	}
	public Employee(int eid, double salary) {
	
		this.eid = eid;
		this.salary = salary;
	}
	 public String display()
	 {
		 return "Employee id is :"+eid+"Salary is :"+salary;
	 }

}
