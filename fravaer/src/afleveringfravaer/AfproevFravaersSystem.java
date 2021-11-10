package afleveringfravaer;

public class AfproevFravaersSystem {

    public static void main(String[] args) {
        int[][] fravaer21S = {
            { 2, 0, 0, 0, 3, 1, 0, 2, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 2, 0, 0, 0, 3, 1, 0, 2, 0, 0, 0, 0 },
            { 1, 2, 1, 2, 1, 2, 0, 2, 0, 0, 4, 0 },
            { 5, 0, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0 }
        };

        FravaersSystem fraværsSystem = new FravaersSystem();
        fraværsSystem.udskrivFravaer(fravaer21S);
        System.out.println("Elev nr. 1 har " + fraværsSystem.samletFravaer(fravaer21S, 0) + " dags fravær i alt");
        System.out.println("Elev nr. 1 har " + fraværsSystem.gennemsnit(fravaer21S, 0) + " dags fravær i gennemsnit per måned");
        System.out.println("Der er " + fraværsSystem.antalUdenFravaer(fravaer21S) + " elev(er) uden fravær");
        System.out.println("Eleven med mest fravær er nr. " + (fraværsSystem.mestFravaer(fravaer21S)+1)
                + " og har " + fraværsSystem.samletFravaer(fravaer21S, fraværsSystem.mestFravaer(fravaer21S)) + " dags fravær");
        fraværsSystem.nulstil(fravaer21S, 0);
        System.out.println("Elev nr. 1 har " + fraværsSystem.samletFravaer(fravaer21S, 0) + " dags fravær i alt");

    }
}
