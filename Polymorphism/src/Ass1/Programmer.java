package Ass1;

public class Programmer extends Employee{
	private double exh,cph;

	public Programmer() {
		super();
	}

	public Programmer(String name, String add, int eid, double salary, double exh, double cph) {
		super(name, add, eid, salary);
		this.exh = exh;
		this.cph = cph;
	}

	public double calsalary()
	{ return (salary+exh+cph);
		
	}

	@Override
	public String toString() {
		return "Programmer [exh=" + exh + ", cph=" + cph + "]"+"calsalry"+calsalary();
	}	

}
