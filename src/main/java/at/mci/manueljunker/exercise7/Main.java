package at.mci.manueljunker.exercise7;

import at.mci.manueljunker.exercise6.Student;
import at.mci.manueljunker.exercise8.InvalidNumberException;
import at.mci.manueljunker.exercise8.StudentManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nrStud = 0;

        while (true) {
            System.out.println("Geben Sie die Anzahl der Studenten ein: ");
            String input = scanner.nextLine().trim();
            try {
                nrStud = Integer.parseInt(input);
                if (nrStud > 0) {
                    break;
                } else {
                    System.out.println("Die Anzahl der Studenten muss eine positive Ganzzahl sein");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ungültige Eingabe. Bitte geben sie eine Ganzzahl ein.");
            }
        }

        // Erstellung des Studenten-Arrays
        Student[] students = new Student[nrStud];

        // Befüllen des Arrays mit neuen Studenten Objekten über die Konsole
        for (int i = 0; i < nrStud; i++) {
            System.out.println("\nErstellung von Student " + (i + 1) + ":");
            students[i] = Student.createStudentFromConsole();
        }

        // exercise 8
        // Eingabe und Validierung von nrObjsToDisplay
        int nrObjsToDisplay = 0;
        while (true) {
            System.out.print("\nGeben Sie die Anzahl der anzuzeigenden Studenten ein: ");
            String input = scanner.nextLine().trim();
            try {
                nrObjsToDisplay = Integer.parseInt(input);
                // Aufruf der displayStudents-Methode mit Fehlerbehandlung
                try {
                    StudentManager.displayStudents(students, nrObjsToDisplay);
                    break; // Erfolgreiche Anzeige, Schleife verlassen
                } catch (InvalidNumberException ine) {
                    System.out.println("Fehler: " + ine.getMessage());
                }
            } catch (NumberFormatException e) {
                System.out.println("Ungültige Eingabe. Bitte geben Sie eine Ganzzahl ein.");
            }
        }

        scanner.close();
    }
}
