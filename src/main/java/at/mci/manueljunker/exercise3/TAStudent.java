package at.mci.manueljunker.exercise3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Die Klasse TAStudent erweitert die Klasse Student und repräsentiert einen Lehrassistenten.
 * Ein Lehrassistent ist ein Student, der in einem oder mehreren Kursen verschiedene Aufgaben zugewiesen bekommt.
 */
public class TAStudent extends Student {
    // Map zur Zuordnung von Kursen zu den Aufgaben des Lehrassistenten
    private Map<String, List<String>> courseTasks;

    /**
     * Standardkonstruktor, der die Eigenschaften der Superklasse initialisiert und die Aufgabenmappe erstellt.
     */
    public TAStudent() {
        super();
        this.courseTasks = new HashMap<>();
    }

    /**
     * Parametrisierter Konstruktor zur Initialisierung der Superklasse und der Aufgabenmappe.
     *
     * @param name              Der Name des Lehrassistenten.
     * @param studentID         Die eindeutige Kennung des Lehrassistenten.
     */
    public TAStudent(String name, int studentID) {
        super(name, studentID);
        this.courseTasks = new HashMap<>();
    }

    /**
     * Parametrisierter Konstruktor zur vollständigen Initialisierung aller Eigenschaften der Superklasse
     * sowie der Aufgabenmappe.
     *
     * @param name              Der Name des Lehrassistenten.
     * @param group             Die Gruppe, der der Lehrassistent angehört.
     * @param proficiencyInJava Das Java-Kenntnisniveau des Lehrassistenten.
     * @param studentID         Die eindeutige Kennung des Lehrassistenten.
     * @param gender            Das Geschlecht des Lehrassistenten.
     */
    public TAStudent(String name, String group, int proficiencyInJava, int studentID, String gender) {
        super(name, group, proficiencyInJava, studentID, gender);
        this.courseTasks = new HashMap<>();
    }

    /**
     * Weist dem Lehrassistenten eine Aufgabe in einem bestimmten Kurs zu.
     *
     * @param course Der Kurs, in dem die Aufgabe zugewiesen wird.
     * @param task   Die zugewiesene Aufgabe.
     */
    public void assignTask(String course, String task) {
        courseTasks.putIfAbsent(course, new ArrayList<>());
        courseTasks.get(course).add(task);
        System.out.println("Aufgabe '" + task + "' wurde dem Kurs '" + course + "' zugewiesen.");
    }

    /**
     * Entfernt eine Aufgabe aus einem bestimmten Kurs.
     *
     * @param course Der Kurs, aus dem die Aufgabe entfernt werden soll.
     * @param task   Die zu entfernende Aufgabe.
     * @return {@code true}, wenn die Aufgabe erfolgreich entfernt wurde, sonst {@code false}.
     */
    public boolean removeTask(String course, String task) {
        if (courseTasks.containsKey(course)) {
            boolean removed = courseTasks.get(course).remove(task);
            if (removed) {
                System.out.println("Aufgabe '" + task + "' wurde aus dem Kurs '" + course + "' entfernt.");
                // Entfernt den Kurs aus der Map, wenn keine Aufgaben mehr vorhanden sind
                if (courseTasks.get(course).isEmpty()) {
                    courseTasks.remove(course);
                }
                return true;
            }
        }
        System.out.println("Aufgabe '" + task + "' konnte im Kurs '" + course + "' nicht gefunden werden.");
        return false;
    }

    /**
     * Gibt die Liste der Aufgaben für einen bestimmten Kurs zurück.
     *
     * @param course Der Kurs, für den die Aufgaben abgerufen werden sollen.
     * @return Die Liste der Aufgaben oder {@code null}, wenn der Kurs nicht existiert.
     */
    public List<String> getTasksForCourse(String course) {
        return courseTasks.get(course);
    }

    /**
     * Gibt eine Zeichenfolgen-Darstellung des Lehrassistenten zurück, einschließlich der zugewiesenen Aufgaben.
     *
     * @return Eine Zeichenfolge, die die Eigenschaften des Lehrassistenten beschreibt.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(", TA-Aufgaben: {");
        for (Map.Entry<String, List<String>> entry : courseTasks.entrySet()) {
            sb.append("\n  Kurs: ").append(entry.getKey()).append(", Aufgaben: ").append(entry.getValue());
        }
        sb.append("\n}");
        return sb.toString();
    }

    /**
     * Gibt die gesamte Aufgabenmappe des Lehrassistenten zurück.
     *
     * @return Die Map der Kurse und deren zugewiesenen Aufgaben.
     */
    public Map<String, List<String>> getCourseTasks() {
        return courseTasks;
    }

    /**
     * Setzt die Aufgabenmappe des Lehrassistenten.
     *
     * @param courseTasks Die neue Map der Kurse und deren zugewiesenen Aufgaben.
     */
    public void setCourseTasks(Map<String, List<String>> courseTasks) {
        this.courseTasks = courseTasks;
    }
}
