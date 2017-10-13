import java.util.Scanner;

/**
 * Magic Five
 * Ratespiel.java
 * Purpose: Guess that 5 is the magic number.
 *
 * String t, tipp: save user input
 *
 * @author Felix Bartling
 * @version 1.03 10/13/17
 * @since 10/05/2017
 */

public class Ratespiel {

    private Ratespiel() {
        System.out.println("Willkommen");

        int tipp = 0;

        while(tipp != 5) {

            String t = input("Erraten Sie die Zahl: ");

            //crashes if t is not numeric
            tipp = Integer.parseInt(t);

            if(tipp == 5) {
                System.out.println("Gewonnen!");
            }
            else {
                if(tipp > 5) {
                    System.out.println("Zu groß!");
                }
                else {
                    System.out.println("Zu klein!");
                }
            }
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