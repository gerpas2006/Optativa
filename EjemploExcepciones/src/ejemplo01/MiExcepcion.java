package ejemplo01;

public class MiExcepcion extends RuntimeException {
    public MiExcepcion(String message) {
        super(message);
    }
    public MiExcepcion() {
        super();
    }
    public MiExcepcion(Long id) {
        super("No se ha encontrado el id %d".formatted(id));
    }
}
