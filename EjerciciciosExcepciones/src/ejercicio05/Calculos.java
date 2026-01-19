package ejercicio05;

import java.util.ArrayList;
import java.util.List;

public class Calculos {

    List<Producto> listaProductos;

    public int aleatorio() throws ErrorException{
        List<Integer> lista = new ArrayList<>();
        int min = 1;
        int max = 10;
        int aleatorioEntero = (int)(Math.random() * (max - min + 1)) + min;
        lista.add(aleatorioEntero);
        for (int numero:lista){
            if (numero==aleatorioEntero){
                throw new ErrorException("El némuero generado ya habia salido");
            }
        }
        return aleatorioEntero;
    }


    public List<Producto> cambiarId(Long idABuscar, Long idNuevo)throws ErrorException {
        for (Producto producto:listaProductos){
            if (producto.getId()==idNuevo){
                throw new ErrorException("Ya hay otro producto con ese ID");
            }
        }
        for (Producto producto:listaProductos){
            if (producto.getId()==idABuscar){
                producto.setId(idNuevo);
            }
        }
        return listaProductos;
    }


}
