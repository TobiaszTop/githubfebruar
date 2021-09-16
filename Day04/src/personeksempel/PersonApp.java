package personeksempel;

public class PersonApp {

	public static void main(String[] args) {
		Person p1 = new Person("Tobi");
		p1.setAddress("Aarhus");
		p1.setMonthlySalary(1000.00);
		p1.setJobs(2);
		p1.printPerson();

		p1.incrementJobs();
		p1.printPerson();
	}

}
