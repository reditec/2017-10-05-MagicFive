import java.util.Scanner;

/**
 * Magic Five
 * Ratespiel.java
 * Purpose: Guess that 5 is the magic number.
 *
 * String t, tipp: save user input
 *
 * @author Felix Bartling
 * @version 1.01 10/06/17
 * @since 10/05/2017
 */

public class Ratespiel {

    private Ratespiel() {
        System.out.println("Willkommen");

        String t = input("Erraten Sie die Zahl: ");

        //crashes if t is not numeric
        int tipp = Integer.parseInt(t);

        if(tipp == 5) {
            System.out.println("Gewonnen!");
        }
        else {
            System.out.println("Verloren!");
        }

        System.out.println("Game over");

    }

    private String input(String ausgabe) {
        System.out.println(ausgabe);
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static void main(String[] args) {
        Ratespiel meinRatespiel = new Ratespiel();
    }
}