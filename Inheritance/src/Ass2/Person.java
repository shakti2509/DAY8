package Ass2;

public class Person {

	private String name;
	private int age;
	public Person() {
		super();
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String display()
	
	{
		return "name is :"+name+"age is :"+age;
	}
}