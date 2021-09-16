package Opgave3;

import java.util.Locale;

public class Name {
	private String fName, mName, lName;

	public Name(String fName, String mName, String lName){
		this.fName = fName;
		this.mName = mName;
		this.lName = lName;
	}

	public String getInit() {
		return "" + fName.charAt(0) + mName.charAt(0) + lName.charAt(0);
	}

	public String getUsername() {
		return "" + fName.substring(0,2).toUpperCase(Locale.ROOT) + mName.length() + lName.substring(lName.length()-2);
	}

}
