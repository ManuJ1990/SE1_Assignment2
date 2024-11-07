package at.mci.manueljunker.exercise9;

import java.util.Scanner;

public class DivisionProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;

        try {
            // Eingabe von a
            System.out.println("Eingabe der ersten Ganzzahl: ");
            String inputA = scanner.nextLine().trim();
            a = Integer.parseInt(inputA); // Kann NumberFormatException werfen

            // Eingabe von b
            System.out.println("Eingabe der zweiten Ganzzahl: ");
            String inputB = scanner.nextLine().trim();
            b = Integer.parseInt(inputB); // Kann NumberFormatException werfen

            int result = a/b; // Kann ArithmeticException werfen
            System.out.println("Ergebnis der Division: " + a + " / " + b + " = " + result);
        } catch (NumberFormatException e) {
            // Behandlung von ungültigen Eingaben
            System.out.println("Fehler: Beide Eingaben müssen gültige Ganzzahlen sein. " + e.getMessage());
        } catch (ArithmeticException e) {
            // Behandlung der Division durch Null
            System.out.println("Fehler: Division durch Null ist nicht erlaubt! " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Programm beendet");
        }
    }

}
