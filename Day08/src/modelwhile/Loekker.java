package modelwhile;

public class Loekker {
	public void udskriv1_10() {
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		System.out.println("7");
		System.out.println("8");
		System.out.println("9");
		System.out.println("10");

	}

	public void udskriv1_10_iteration() {
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
	}

	public int summer() {
		int sum = 0;
		int i = 1;
		while (i <= 10) {
			sum = sum + i;
			i++;
			
		}
		return sum;

	}

	public int summer(int n) {
		int sum = 0;
		int i = 1;
		while (i <= n) {
			if(i%2==0){
				sum = sum + i;
			}
			i++;
		}
		return sum;

	}

	public int multiplum(int a, int b) {
		int resultat = 0;
		int i = 0;
		while (i < a) {
			resultat = resultat + b;
			i++;
		}
		return resultat;

	}

	public int summerEven() {
		// TODO Opgave 1.a
		return -1;
	}

	public int summerSquare(int n) {
		int sum = 0;
		int i = 1;
		while (true) {
			if(i*i>n){break;}
			sum += i*i;
			i++;
		}
		return sum;
	}

	public void allPowers(int n) {
		int i = 1;
		while (i <= n) {
			System.out.println(Math.pow(2, i));
			i++;
		}
	}

	public int sumOdd(int a, int b) {
		int i = a;
		int sum = 0;
		while(i <= b){
			if(i%2==1){
				sum += i;
			}
			i++;
		}
		return sum;
	}

	public int sumOfOddDigits(int number) {
		String numberString = Integer.toString(number);
		int i = 0;
		int sum = 0;
		while(i < numberString.length()){
			if(Character.getNumericValue(numberString.charAt(i)) % 2 == 1){
				sum += Character.getNumericValue(numberString.charAt(i));
			}
			i++;
		}
		return sum;
	}
}
