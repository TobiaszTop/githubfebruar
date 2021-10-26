package mode;

public class Teacher extends Person {

	private double yearSalary;
	private String teacherID;

	public Teacher(String name, String address, String qualification, double yearSalary, String teacherID) {
		
		super(name, address, qualification); // kalder constructoren i
		// superklassen, dette kald skal ske som det første i metoden

		this.yearSalary = yearSalary; // attributten i subklassen får en
											// værdi
		this.teacherID = teacherID;
	}

	public double getYearSalary() {
		return yearSalary;
	}

	public void setYearSalary(double yearSalary) {
		this.yearSalary = yearSalary;
	}

	public void udskrivAdresse() {
		System.out.println("Adresseoplysninger: " + address);

	}

	@Override
	public void udskrivPerson() {
		super.udskrivPerson();
		System.out.println("Salary: " + yearSalary);
		System.out.println("model.Teacher identifikation: " + teacherID);
	}

}
