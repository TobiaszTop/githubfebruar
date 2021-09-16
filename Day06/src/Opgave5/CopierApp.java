package Opgave5;

public class CopierApp {

	public static void main(String[] args) {
		Copier c1 = new Copier(20);
		c1.makeCopy();			// paper = 19
		c1.makeCopy(10);  // paper = 9
		c1.makeCopy(100); // Not enough paper!
		c1.makePaperJam();		// paperStuck = true
		c1.makeCopy();			// Paper jammed!
		c1.fixJam();			// paperStuck = false
		c1.insertPaper(400);	// paper = 409
		c1.insertPaper(100);	// paper = 409 Too much paper!
		System.out.println(c1.getPaper());
	}

}
