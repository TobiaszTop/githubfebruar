package afleveringfravaer;

public class FravaersSystem {
	/**
	 * Fraværstallene udskrives på skærmen
	 *
	 * @param fravaer
	 */
	public void udskrivFravaer(int[][] fravaer) {
		String[] months = { "Jan", "Feb", "Mar", "Apr", "Maj", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dec"};
		for (int i=0; i<fravaer.length; i++){
			System.out.println("\n----------------------------------------\n");
			System.out.println("Student nr. " + (i+1) + " fravær:");
			for(int j=0; j<fravaer[0].length; j++){
				System.out.println(months[j] + "\t- " + fravaer[i][j] + " dage");
			}
		}
		System.out.println("\n----------------------------------------\n");
	}

	/**
	 * Returnerer det samlede antal fravaerdage over 12 måneder for eleven med
	 * elevnr.
	 *
	 * @param fravaer
	 * @param elevNr
	 * @return
	 */
	public int samletFravaer(int[][] fravaer, int elevNr) {
		int totalAbsence = 0;
		for(int i=0; i<fravaer[elevNr].length; i++){
			totalAbsence += fravaer[elevNr][i];
		}
		return totalAbsence;
	}

	/**
	 * Returnerer det gennemsnitlige antal fraværsdage pr måned for eleven med
	 * elevNr.
	 *
	 * @param fravaer
	 * @param elevNr
	 * @return
	 */
	public double gennemsnit(int[][] fravaer, int elevNr) {
		return samletFravaer(fravaer, elevNr) / 12.0;
	}

	/**
	 * Returnerer antallet af elever der ikke har haft fravær i de 12 måneder.
	 *
	 * @param fravaer
	 * @return
	 */
	public int antalUdenFravaer(int[][] fravaer) {
		int totalFlawlessStudents = 0;
		for(int i=0; i<fravaer.length; i++){
			if(samletFravaer(fravaer, i) == 0){ totalFlawlessStudents++; }
		}
		return totalFlawlessStudents;
	}

	/**
	 * Returnerer elevNr for den elev der har haft mest fravær igennem de 12
	 * måneder. Hvis flere elever har haft højst fravær, returneres elevnummer
	 * for en af disse.
	 *
	 * @param fravaer
	 * @return
	 */
	public int mestFravaer(int[][] fravaer) {
		int mostAbsentStudent = 0;
		int highestAbsence = 0;
		int tempAbsence;
		for(int i=0; i<fravaer.length; i++){
			tempAbsence = samletFravaer(fravaer, i);
			if(tempAbsence > highestAbsence){
				mostAbsentStudent = i;
				highestAbsence = tempAbsence;
			}
		}
		return mostAbsentStudent;
	}

	/**
	 * Registrerer at elenven med elevNr ikke har haft fravær i nogen af de 12
	 * måneder.
	 *
	 * @param fravaer
	 * @param elevNr
	 */
	public void nulstil(int[][] fravaer, int elevNr) {
		for(int i=0; i<fravaer[elevNr].length; i++){
			fravaer[elevNr][i] = 0;
		}
	}
}
