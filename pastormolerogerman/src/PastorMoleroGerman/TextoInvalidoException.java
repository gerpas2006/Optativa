package PastorMoleroGerman;

public class TextoInvalidoException extends RuntimeException {
    public TextoInvalidoException(String message) {
        super(message);
    }
    public TextoInvalidoException() {
        super();
    }
}
