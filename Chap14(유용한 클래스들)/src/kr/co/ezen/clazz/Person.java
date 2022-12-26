package kr.co.ezen.clazz;

public class Person {

	
	private String name;
	private int age;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
		
	public Person(String name) {
		//super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
	
	
}
