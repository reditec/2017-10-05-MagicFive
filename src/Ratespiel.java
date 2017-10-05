/**
 * Magic Five
 * Ratespiel.java
 * Purpose: Guess that 5 is the magic number.
 *
 * @author Felix Bartling
 * @version 1.0 10/05/17
 * @since 10/05/2017
 */

public class Ratespiel {

    public Ratespiel()
    {
        System.out.println("Willkommen");

        //TO-DO: declare function "input" --> will be fixed during next lecture
        String t = input("Erraten Sie die Zahl: ");

        int tipp = Integer.parseInt(t);

        if(tipp == 5) {
            System.out.println("Gewonnen");
        }
        else
        {
            System.out.println("Verloren");
        }

        System.out.println("Das Spiel ist aus");

    }

    /* public static void main(String[] args) {

    }*/
}
