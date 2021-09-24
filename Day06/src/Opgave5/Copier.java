package Opgave5;

/**
 * Write a description of class Barn here.
 */
public class Copier {
	private int paper;
	private boolean paperStuck = false;

	public Copier(int paper) {
		this.paper = paper;
	}
	public Copier() {
		this.paper = 0;
	}
	public int getPaper() {
		return this.paper;
	}

	public void insertPaper(int paper) {
		if(this.paper+paper > 500){
			System.out.println("For meget papir!");
		}else{
			this.paper += paper;
		}
	}

	public void makeCopy(){
		if (paperStuck){
			System.out.println("Papir sidder fast!");
		}
		else if (paper==0){
			System.out.println("Ingen papir!");
		}else{
			this.paper--;
		}
	}

	public void makeCopy(int copies){
		boolean a = (copies<0);
		if (paperStuck){
			System.out.println("Papir sidder fast!");
		}
		else if (paper-copies<=0){
			System.out.println("For lidt papir!");
		}else{
			this.paper-=copies;
		}
	}

	public void makePaperJam(){
		paperStuck = true;
	}

	public void fixJam(){
		paperStuck = false;
	}

}
