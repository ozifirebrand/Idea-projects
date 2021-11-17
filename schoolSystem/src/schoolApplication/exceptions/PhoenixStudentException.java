package schoolApplication.exceptions;

public class PhoenixStudentException extends PhoenixClassException{
    public PhoenixStudentException(String message) {
        super(message);
    }

    public PhoenixStudentException(String message, Throwable cause) {
        super(message, cause);
    }

    public PhoenixStudentException(Throwable cause) {
        super(cause);
    }
}
