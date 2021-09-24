package modelwhile;

public class App {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Loekker loekker = new Loekker();

        //loekker.udskriv1_10();
        //loekker.udskriv1_10_iteration();

        //System.out.println(loekker.summer());
    //System.out.println(loekker.summer(100));
        // System.out.println(loekker.multiplum(4, 3));

		// Kald af metoder der afprøver opgave 1
		// System.out.println(loekker.summerEven());
    //System.out.println(loekker.summerSquare(100));

		// Klad af metoder der afprøver opgave 3
    //loekker.allPowers(20);
    //System.out.println(loekker.sumOdd(3, 19));
        System.out.println(loekker.sumOfOddDigits(32677));

    }
}
