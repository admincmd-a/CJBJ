package xyz.admincmd.cjbj.errorSet;

public class CriticalError extends RuntimeException {
    public CriticalError(String message) {
        super(message);
    }
}
