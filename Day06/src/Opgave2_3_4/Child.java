package Opgave2_3_4;

/**
 * Write a description of class Barn here.
 */
public class Child {
	private int age;
	private boolean boy; // true if the child is a boy

	public Child(int age, boolean boy) {
		this.age = age;
		this.boy = boy;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isBoy() {
		return boy;
	}

	public void setBoy(boolean boy) {
		this.boy = boy;
	}

	public String institution() {
		if (age==0){ return "Home"; }
		else
		if (age<3){ return "Nursery"; }
		else
		if (age<6){ return "Kindergarten"; }
		else
		if (age<17){ return "School"; }
		else
		if (age>=17){ return "Out of School"; }
		else {return "Child cannot have negative age"; }
	}

	public String gender() {
		if (isBoy()){ return "Boy"; }
		else if (!isBoy()){ return "Girl"; }
		return null;
	}

	public String team() {
		if (!isBoy() && age<8){ return "Tumbling girls"; }
		else if (!isBoy() && age>=8){ return "Springy girls"; }
		else if (isBoy() && age<8){ return "Young cubs"; }
		else if (isBoy() && age>=8){ return "Young cubs"; }
		return null;
	}
}
