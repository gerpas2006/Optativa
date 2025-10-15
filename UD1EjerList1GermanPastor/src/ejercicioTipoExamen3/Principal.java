package ejercicioTipoExamen3;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {



        Vehiculo v;
        Vehiculo v1 = new Furgoneta("5678DEF", 70, "Ford Transit", true, 2, 3, 1200);
        Vehiculo v2 = new Moto("9012GHI", 30, "Yamaha", false, 5, 2, 600);
        Vehiculo v3 = new Coche("1234ABC", 50, "Toyota", false, 3, 5, "Gasolina", 10);
        List<Vehiculo> lista = new ArrayList<>();
        lista.add(v1);
        lista.add(v2);
        lista.add(v3);

        GestionVehiculo gs = new GestionVehiculo(lista);

        gs.listarNoOcupados();

    }
}
