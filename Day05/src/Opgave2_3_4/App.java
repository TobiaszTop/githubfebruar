package Opgave2_3_4;

import java.util.Locale;

public class App
{
	public static void main(String[] arg) {
		String ord1 = "Datamatiker";
		String ord2 = "Uddannelsen";
		System.out.println(ord1.toUpperCase(Locale.ROOT));			// DATAMATIKER
		System.out.println(ord2.toLowerCase(Locale.ROOT));			// uddannelsen
		System.out.println(ord1 + " " + ord2);						// Datamatiker Uddannelsen
		String ord3 = ord1 + " " + ord2.toLowerCase(Locale.ROOT);	// Datamatiker uddannelsen
		System.out.println(ord3);
		System.out.println(ord3.length());							// 23
		System.out.println(ord1.substring(0,7));					// Datamat
		System.out.println(ord2.substring(3,7));					// anne
		System.out.println(ord3.substring(12,ord3.length()));		// uddannelsen
		ord1.charAt(0);
	}
}

