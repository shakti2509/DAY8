package Ass1;

public class Employee extends Person {
	private int eid;
	 private double salary;
	public Employee() {
		super();
	}
	public Employee(int eid, double salary, String name, int age) {
		super(name,age);
		this.eid = eid;
		this.salary = salary;
	}
	 public String display()
	 {
		 return "Employee id is :"+eid+"Salary is :"+salary+super.display();
	 }

}
