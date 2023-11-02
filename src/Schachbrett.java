import java.util.Scanner;

public class Schachbrett {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        System.out.print("Startwert: ");
        int startwert = eingabe.nextInt();
        System.out.print("Anzahl Zeilen: ");
        int anzahlDerZeilen = eingabe.nextInt();

        // Wächteranweisung (Türsteher)
        if (startwert < 0) {
            System.out.println("Sorry, mit dem Startwert komme ich nicht klar.");
            return;
        }
        int maximalerAusgabeWert = startwert + (anzahlDerZeilen - 1) * 2;

        for (int zeile = startwert; zeile < startwert + anzahlDerZeilen; zeile++) {
            for (int spalte = zeile; spalte < zeile + anzahlDerZeilen; spalte++) {

                int zehnerwert = 10;
                while (maximalerAusgabeWert >= zehnerwert) {
                    if (spalte < zehnerwert) {
                        System.out.print(" ");
                    }
                    zehnerwert = zehnerwert * 10;
                }

                System.out.print(spalte + " ");
            }
            System.out.println();
        }
    }
}
