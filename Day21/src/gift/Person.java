package gift;

import java.util.ArrayList;

/**
 * Models a training plan for a Swimmer
 */
public class Person {
	private String name;
	private int age;
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String getName(){
		return name;
	}
	public int getAge() { return age; }
	public void setAge(int age) {this.age = age;}
	public String toString(){ return "";}
}
