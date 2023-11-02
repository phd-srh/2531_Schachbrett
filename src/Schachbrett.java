import java.util.Scanner;

public class Schachbrett {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        System.out.print("Startwert: ");
        int startwert = eingabe.nextInt();
        System.out.print("Anzahl Zeilen: ");
        int anzahlDerZeilen = eingabe.nextInt();

        for (int zeile = startwert; zeile < startwert + anzahlDerZeilen; zeile++) {
            for (int spalte = zeile; spalte < zeile + anzahlDerZeilen; spalte++) {
                if (spalte < 10) {
                    System.out.print(" ");
                }
                System.out.print(spalte + " ");
            }
            System.out.println();
        }
    }
}
