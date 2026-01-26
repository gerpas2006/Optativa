package PastorMoleroGerman;

public class CalculoInvalidoException extends RuntimeException {
    public CalculoInvalidoException(String message) {
        super(message);
    }
    public CalculoInvalidoException() {
        super();
    }
}
