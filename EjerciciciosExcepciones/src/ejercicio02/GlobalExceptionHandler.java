package ejercicio02;

public class GlobalExceptionHandler extends RuntimeException {
    public GlobalExceptionHandler(String message) {
        super(message);
    }
    public GlobalExceptionHandler() {
        super();
    }
}
