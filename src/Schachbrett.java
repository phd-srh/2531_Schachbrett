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
                if (spalte < 10 && maximalerAusgabeWert >= 10) {
                    System.out.print(" ");
                }
                if (spalte < 100 && maximalerAusgabeWert >= 100) {
                    System.out.print(" ");
                }
                if (spalte < 1000 && maximalerAusgabeWert >= 1000) {
                    System.out.print(" ");
                }
                System.out.print(spalte + " ");
            }
            System.out.println();
        }
    }
}
