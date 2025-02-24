package gr.aueb.cf.exceptions;

public class SsnNotValidException extends Exception {
    private static final long serialVersionUid = 1L;

    public SsnNotValidException(String ssn) {
        super("Ssn " + ssn + " is not valid");
    }
}
