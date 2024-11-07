package at.mci.manueljunker.exercise6;

import java.util.ArrayList;
import java.util.List;
//exercise 6
import java.util.Scanner;

/**
 * Die Klasse Student repräsentiert einen Studenten mit Eigenschaften wie Name, Gruppe, Java-Kenntnisniveau,
 * Studenten-ID, Geschlecht und einer Liste von Noten. Sie bietet Methoden zum Abrufen und Ändern dieser
 * Eigenschaften sowie Funktionen zur Berechnung des Notendurchschnitts und zum Vergleich der Java-Kenntnisse
 * mit anderen Studenten.
 */
public class Student {
    private String name;
    private String group;
    private int proficiencyInJava;
    private int studentID;
    private String gender;
    // exercise 6
    protected List<Integer> grades;
    // exercise 7
    protected static int studentCount;

    /**
     * Standardkonstruktor, der alle Felder mit Standardwerten initialisiert und die Anzahl der erstellten Studenten erhöht.
     */
    public Student() {
        this.name = "";
        this.group = "";
        this.proficiencyInJava = 0;
        this.studentID = 0;
        this.gender = "";
        this.grades = new ArrayList<>();
        studentCount++;
        System.out.println("Student erzeugt! Es existieren aktuell " + studentCount + " Studenten.");
    }

    /**
     * Parametrisierter Konstruktor zur Initialisierung der Felder Name und StudentenID eines Studenten.
     *
     * @param name              Der Name des Studenten.
     * @param studentID         Die eindeutige Kennung des Studenten.
     */
    public Student(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
        this.grades = new ArrayList<>();
        studentCount++;
        System.out.println("Student erzeugt! Es existieren aktuell " + studentCount + " Studenten.");
    }

    /**
     * Parametrisierter Konstruktor zur Initialisierung aller Felder eines Studenten.
     *
     * @param name              Der Name des Studenten.
     * @param group             Die Gruppe, der der Student angehört.
     * @param proficiencyInJava Das Java-Kenntnisniveau des Studenten.
     * @param studentID         Die eindeutige Kennung des Studenten.
     * @param gender            Das Geschlecht des Studenten.
     */
    public Student(String name, String group, int proficiencyInJava, int studentID, String gender) {
        this.name = name;
        this.group = group;
        this.proficiencyInJava = proficiencyInJava;
        this.studentID = studentID;
        this.gender = gender;
        this.grades = new ArrayList<>();
        studentCount++;
        System.out.println("Student erzeugt! Es existieren aktuell " + studentCount + " Studenten.");
    }

    /**
     * Gibt den Namen des Studenten zurück.
     *
     * @return Der Name des Studenten.
     */
    public String getName() {
        return name;
    }

    /**
     * Setzt den Namen des Studenten.
     *
     * @param name Der neue Name des Studenten.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gibt die Gruppe des Studenten zurück.
     *
     * @return Die Gruppe des Studenten.
     */
    public String getGroup() {
        return group;
    }

    /**
     * Setzt die Gruppe des Studenten.
     *
     * @param group Die neue Gruppe des Studenten.
     */
    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * Gibt das Java-Kenntnisniveau des Studenten zurück.
     *
     * @return Das Java-Kenntnisniveau des Studenten.
     */
    public int getProficiencyInJava() {
        return proficiencyInJava;
    }

    /**
     * Setzt das Java-Kenntnisniveau des Studenten.
     *
     * @param proficiencyInJava Das neue Java-Kenntnisniveau des Studenten.
     */
    public void setProficiencyInJava(int proficiencyInJava) {
        this.proficiencyInJava = proficiencyInJava;
    }

    /**
     * Gibt die eindeutige Kennung des Studenten zurück.
     *
     * @return Die studentID des Studenten.
     */
    public int getStudentID() {
        return studentID;
    }

    /**
     * Setzt die eindeutige Kennung des Studenten.
     *
     * @param studentID Die neue Kennung des Studenten.
     */
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    /**
     * Gibt das Geschlecht des Studenten zurück.
     *
     * @return Das Geschlecht des Studenten.
     */
    public String getGender() {
        return gender;
    }

    /**
     * Setzt das Geschlecht des Studenten.
     *
     * @param gender Das neue Geschlecht des Studenten.
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Gibt die Liste der Noten des Studenten zurück.
     *
     * @return Die Liste der Noten.
     */
    public List<Integer> getGrades() {
        return grades;
    }

    /**
     * Fügt eine Note zur Liste der Noten des Studenten hinzu.
     *
     * @param grade Die hinzuzufügende Note.
     */
    public void addGrade(int grade) {
        grades.add(grade);
    }

    /**
     * Gibt die Gesamtanzahl der erstellten Studenten zurück.
     *
     * @return Die Gesamtanzahl der erstellten Studenten.
     */
    public static int getStudentCount() {
        return studentCount;
    }

    /**
     * Gibt eine Zeichenfolgen-Darstellung des Studenten zurück.
     *
     * @return Eine Zeichenfolge, die die Eigenschaften des Studenten beschreibt.
     */
    @Override
    public String toString() {
        return "Student name: " + name +
                ", group: " + group +
                ", proficiencyInJava: " + proficiencyInJava +
                ", studentID: " + studentID +
                ", gender: " + gender;
    }

    // exercise 4

    /**
     * Vergleicht die Java-Kenntnisse dieses Studenten mit denen eines anderen Studenten.
     *
     * @param anotherStudent Ein anderer Student, dessen Java-Kenntnisse verglichen werden sollen.
     * @return {@code true}, wenn beide Studenten die gleiche Java-Kenntnisstufe haben,
     * andernfalls {@code false}.
     */
    public boolean hasSameFluencyInJavaAs(Student anotherStudent) {
        return this.getProficiencyInJava() == anotherStudent.getProficiencyInJava();
    }

    // exercise 5

    /**
     * Überprüft, ob dieses Student-Objekt gleich dem angegebenen Objekt ist.
     * In dieser Implementierung wird geprüft, ob beide Objekte auf die gleiche Speicheradresse verweisen.
     *
     * @param obj Das Objekt, das verglichen werden soll.
     * @return {@code true}, wenn beide Objekte auf die gleiche Speicheradresse verweisen, sonst {@code false}.
     */
    @Override
    public boolean equals(Object obj) {
        return this == obj;
    }

    // exercise 6

    /**
     * Berechnet die Durchschnittsnote über alle von einem Studenten belegten Kurse.
     *
     * @return Den Notendurchschnitt als {@code float}, falls Noten vorhanden sind, ansonsten 0.
     */
    public float averageNote() {
        if (grades.isEmpty()) {
            System.out.println("Keine Noten vorhanden!");
            return 0;
        }

        float sum = 0.0f;
        for (int grade : grades) {
            sum += grade;
        }

        return sum / grades.size();
    }

    // exercise6
    /**
     * Statische Methode zum Erstellen eines neuen Student-Objekts über die Konsole.
     *
     * @return Ein neues Student-Objekt mit den eingegebenen Werten.
     */
    public static Student createStudentFromConsole() {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        String group = "";
        int proficiencyInJava = 0;
        int studentID = 0;
        String gender = "";

        // Eingabe und Validierung des Namens
        while (true) {
            System.out.print("Geben Sie den Namen des Studenten ein: ");
            name = scanner.nextLine().trim();
            if (!name.isEmpty()) {
                break;
            } else {
                System.out.println("Name darf nicht leer sein. Bitte versuchen Sie es erneut.");
            }
        }

        // Eingabe und Validierung der Gruppe
        while (true) {
            System.out.print("Geben Sie die Gruppe des Studenten ein: ");
            group = scanner.nextLine().trim();
            if (!group.isEmpty()) {
                break;
            } else {
                System.out.println("Gruppe darf nicht leer sein. Bitte versuchen Sie es erneut.");
            }
        }

        // Eingabe und Validierung des Java-Kenntnisniveaus
        while (true) {
            System.out.print("Geben Sie das Java-Kenntnisniveau des Studenten (1-10) ein: ");
            String input = scanner.nextLine().trim();
            try {
                proficiencyInJava = Integer.parseInt(input);
                if (proficiencyInJava >= 1 && proficiencyInJava <= 10) {
                    break;
                } else {
                    System.out.println("Java-Kenntnisniveau muss zwischen 1 und 10 liegen. Bitte versuchen Sie es erneut.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ungültige Eingabe. Bitte geben Sie eine ganze Zahl ein.");
            }
        }

        // Eingabe und Validierung der Studenten-ID
        while (true) {
            System.out.print("Geben Sie die Studenten-ID ein (positive ganze Zahl): ");
            String input = scanner.nextLine().trim();
            try {
                studentID = Integer.parseInt(input);
                if (studentID > 0) {
                    break;
                } else {
                    System.out.println("Studenten-ID muss eine positive ganze Zahl sein. Bitte versuchen Sie es erneut.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ungültige Eingabe. Bitte geben Sie eine ganze Zahl ein.");
            }
        }

        // Eingabe und Validierung des Geschlechts
        while (true) {
            System.out.print("Geben Sie das Geschlecht des Studenten ein (männlich/weiblich/divers): ");
            gender = scanner.nextLine().trim().toLowerCase();
            if (gender.equals("männlich") || gender.equals("weiblich") || gender.equals("divers")) {
                // Optional: Großschreibung des ersten Buchstabens
                gender = gender.substring(0, 1).toUpperCase() + gender.substring(1);
                break;
            } else {
                System.out.println("Ungültige Eingabe. Bitte geben Sie 'männlich', 'weiblich' oder 'divers' ein.");
            }
        }

        // Erstellung des neuen Student-Objekts
        Student newStudent = new Student(name, group, proficiencyInJava, studentID, gender);
        System.out.println("Neuer Student wurde erfolgreich erstellt:");
        System.out.println(newStudent.toString());

        return newStudent;
    }
}
