package personeksempel;

/**
 * Klasse der beskriver en ansat
 *
 * @author mad
 *
 */
public class Person {

	private String name;
	private String address;
	private double monthlySalary;
	private int jobs;

	public Person(String inputName){//, String inputAddress, double inputMonthlySalary, int inputJobs) {
		name = inputName;
		//address = inputAddress;
		//monthlySalary = inputMonthlySalary;
		//jobs = inputJobs;
	}

	public void setName(String inputName) {
		name = inputName;
	}
	public void setAddress(String inputAddress) {
		address = inputAddress;
	}
	public void setMonthlySalary(double inputMonthlySalary) { monthlySalary = inputMonthlySalary; }
	public void setJobs(int inputJobs) { jobs = inputJobs; }

	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public double getMonthlySalary() { return monthlySalary; }
	public int getJobs() { return jobs; }

	public void incrementJobs(){
		jobs++;
	}

	public void printPerson() {
		System.out.println("*******************");
		System.out.println("Fornavn: " + name);
		System.out.println("Adresse: " + address);
		System.out.println("Monthly: $" + monthlySalary);
		//double yearlySalary = monthlySalary*12*1.025;
		System.out.println("Yearly: $" + monthlySalary*1.025*12);
		System.out.println("Past jobs: " + jobs);
		System.out.println("*******************");
		System.out.println();
	}
}
