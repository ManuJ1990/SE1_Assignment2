package at.mci.manueljunker.exercise8;

/**
 * Exception, die geworfen wird, wenn die Anzahl der anzuzeigenden Studenten ungültig ist.
 */
public class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}
