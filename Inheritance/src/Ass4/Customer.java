package Ass4;

public class Customer {
	private String email,name;

	public Customer() {
		super();
	}

	public Customer(String email, String name) {
		super();
		this.email = email;
		this.name = name;
	}
	public String toString()
	{
		return "email id is :  "+email+"name is :  "+name;
	}

}
