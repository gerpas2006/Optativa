package ejercicioTipoExamen;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    static void main() {


        Producto p2;
        List<Producto> lista = new ArrayList<>();
        lista.add(new EspadaLaser("Espada",5.2,5,"doble"));
        Ventas v = new Ventas(lista);
        v.calcularRecaudado(5);
        lista.remove(lista);
    }
}
