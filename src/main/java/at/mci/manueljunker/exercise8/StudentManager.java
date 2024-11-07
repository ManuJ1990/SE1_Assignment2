package at.mci.manueljunker.exercise8;

import at.mci.manueljunker.exercise6.Student;

/**
 * Hilfsklasse zur Verwaltung und Anzeige von Studenten.
 */
public class StudentManager {

    /**
     * Zeigt Informationen über eine bestimmte Anzahl von Studenten an.
     *
     * @param students          Das Array von Student-Objekten.
     * @param nrObjsToDisplay   Die Anzahl der Studenten, die angezeigt werden sollen.
     * @throws InvalidNumberException Wenn die Anzahl ungültig ist.
     */
    public static void displayStudents(Student[] students, int nrObjsToDisplay) throws InvalidNumberException {
        if (nrObjsToDisplay < 0) {
            throw new InvalidNumberException("Die Anzahl der anzuzeigenden Studenten darf nicht negativ sein.");
        }
        if (nrObjsToDisplay > students.length) {
            throw new InvalidNumberException("Die Anzahl der anzuzeigenden Studenten darf nicht größer sein als die vorhandene Anzahl.");
        }

        System.out.println("\nAnzeige der ersten " + nrObjsToDisplay + " Studenten:");
        for (int i = 0; i < nrObjsToDisplay; i++) {
            System.out.println("Student " + (i + 1) + ": " + students[i]);
        }
    }
}
