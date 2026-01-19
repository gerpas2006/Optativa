package ejercicio05;

public class ErrorException extends RuntimeException {
    public ErrorException(String message) {
        super(message);
    }
    public ErrorException() {
        super();
    }
}
