package ejercicio04;

public class CalculoException extends RuntimeException {
    public CalculoException(String message) {
        super(message);
    }
    public CalculoException() {
        super();
    }
}
