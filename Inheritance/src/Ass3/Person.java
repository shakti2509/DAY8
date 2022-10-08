package Ass3;

public class Person {
	private int age;
	private String name;
	public Person() {
		super();
	}
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public String toString()
	{
		return "age is : "+age+" name is : "+name;
	}
	

}
