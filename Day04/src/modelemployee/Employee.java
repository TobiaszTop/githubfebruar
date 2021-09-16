package modelemployee;

public class Employee { //class

	private String name;
	private String surname;
	private boolean trainee;
	private int age;

	public Employee(String inputName, String inputSurname, int inputAge) { //constructor
		name = inputName;
		surname = inputSurname;
		age = inputAge;
		trainee = true;
	}

	//when object is

	public void setName(String inputName) {
		name = inputName;
	}
	public void setSurname(String inputSurname) {
		surname = inputSurname;
	}
	public void setAge(int inputAge) { age = inputAge; }

	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public int getAge() { return age; }

	public void setTrainee(boolean isTrainee) {
		trainee = isTrainee;
	}

	public boolean isTrainee() {
		return trainee;
	}

	public void printEmployee() {
		System.out.println("*******************");
		System.out.println("Fornavn: " + name);
		System.out.println("Efternavn: " + surname);
		System.out.println("Trainee: " + trainee);
		System.out.println("Alder: " + age);
		System.out.println("*******************");
		System.out.println();
	}
	public void birthday() {
		age++;
	}
}
