package opgave1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class arrayApp {

    public static void main(String[] args) {

        System.out.println("\n---Print-all-objects-in-names---");
        ArrayList<String> names = new ArrayList<String>();
        names.add("Pax");
        names.add("Fido");
        names.add("Molly");
        names.add("Pluto");
        names.add("Juno");
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("\n---Replace-index=2-with-King---");
        names.set(2, "King");
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("\n---Add-Trine-at-index=4---");
        names.add(4, "Trine");
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("\n---Add-Bella-at-index=0---");
        names.add(0, "Bella");
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("\n---Print-arraylist-size---");
        System.out.println("ArrayList names is " + names.size() + " long");

        System.out.println("\n---Print-names-with-five-letters---");
        int fiveLetterNameCount = 0;
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).length()==5) {
                System.out.println(names.get(i));
                fiveLetterNameCount++;
            }
        }
        System.out.println(fiveLetterNameCount + " names with five letters");

        System.out.println("\n---Print-names-in-reverse-order---");
        for (int i = names.size()-1; i >= 0; i--) {
            System.out.println(names.get(i));
        }

        System.out.println("\n---Print-every-2nd-name---");
        for (int i = 0; i < names.size(); i+=2) {
            System.out.println(names.get(i));
        }
    }




}
