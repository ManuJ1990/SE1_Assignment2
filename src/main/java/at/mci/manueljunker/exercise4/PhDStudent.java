package at.mci.manueljunker.exercise4;

import at.mci.manueljunker.exercise3.TAStudent;

/**
 * Die Klasse PhDStudent erweitert die Klasse TAStudent und repräsentiert einen Doktoranden.
 * Ein PhD-Student ist ein Student mit einem Master-Abschluss, der einen höheren Abschluss anstrebt.
 * Einem PhD-Studenten können Lehrunterstützungsaufgaben zugewiesen werden.
 */
public class PhDStudent extends TAStudent {
    private String masterDegree;
    private String desiredDegree;

    /**
     * Standardkonstruktor, der die Eigenschaften der Superklasse initialisiert und die spezifischen Felder setzt.
     */
    public PhDStudent() {
        super();
        this.masterDegree = "Master";
        this.desiredDegree = "PhD";
    }

    /**
     * Parametrisierter Konstruktor zur Initialisierung der Superklasse und der spezifischen Felder.
     *
     * @param name            Der Name des PhD-Studenten.
     * @param studentID       Die eindeutige Kennung des PhD-Studenten.
     * @param masterDegree    Der Master-Abschluss des PhD-Studenten.
     * @param desiredDegree   Der höhere Abschluss, den der PhD-Student anstrebt.
     */
    public PhDStudent(String name, int studentID, String masterDegree, String desiredDegree) {
        super(name, studentID);
        this.masterDegree = masterDegree;
        this.desiredDegree = desiredDegree;
    }

    /**
     * Parametrisierter Konstruktor zur vollständigen Initialisierung aller Eigenschaften der Superklasse
     * sowie der spezifischen Felder.
     *
     * @param name            Der Name des PhD-Studenten.
     * @param group           Die Gruppe, der der PhD-Student angehört.
     * @param proficiencyInJava Das Java-Kenntnisniveau des PhD-Studenten.
     * @param studentID       Die eindeutige Kennung des PhD-Studenten.
     * @param gender          Das Geschlecht des PhD-Studenten.
     * @param masterDegree    Der Master-Abschluss des PhD-Studenten.
     * @param desiredDegree  Der höhere Abschluss, den der PhD-Student anstrebt.
     */
    public PhDStudent(String name, String group, int proficiencyInJava, int studentID, String gender,
                      String masterDegree, String desiredDegree) {
        super(name, group, proficiencyInJava, studentID, gender);
        this.masterDegree = masterDegree;
        this.desiredDegree = desiredDegree;
    }

    /**
     * Gibt den Master-Abschluss des PhD-Studenten zurück.
     *
     * @return Der Master-Abschluss.
     */
    public String getMasterDegree() {
        return masterDegree;
    }

    /**
     * Setzt den Master-Abschluss des PhD-Studenten.
     *
     * @param masterDegree Der neue Master-Abschluss.
     */
    public void setMasterDegree(String masterDegree) {
        this.masterDegree = masterDegree;
    }

    /**
     * Gibt den angestrebten höheren Abschluss des PhD-Studenten zurück.
     *
     * @return Der angestrebte höhere Abschluss.
     */
    public String getDesiredDegree() {
        return desiredDegree;
    }

    /**
     * Setzt den angestrebten höheren Abschluss des PhD-Studenten.
     *
     * @param desiredDegree Der neue angestrebte höhere Abschluss.
     */
    public void setDesiredDegree(String desiredDegree) {
        this.desiredDegree = desiredDegree;
    }

    /**
     * Gibt eine Zeichenfolgen-Darstellung des PhD-Studenten zurück, einschließlich der spezifischen Eigenschaften.
     *
     * @return Eine Zeichenfolge, die die Eigenschaften des PhD-Studenten beschreibt.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(", Master-Abschluss: ").append(masterDegree);
        sb.append(", Angestrebter Abschluss: ").append(desiredDegree);
        return sb.toString();
    }
}
