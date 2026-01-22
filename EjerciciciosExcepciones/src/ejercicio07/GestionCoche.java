package ejercicio07;

import ejercicio05.ErrorException;

import java.util.List;
import java.util.Set;

public class GestionCoche {

    List<Coche> listaCoches;

    public GestionCoche(List<Coche> listaCoches) {
        this.listaCoches = listaCoches;
    }

    public List<Coche> getListaCoches() {
        return listaCoches;
    }

    public void setListaCoches(List<Coche> listaCoches) {
        this.listaCoches = listaCoches;
    }

    @Override
    public String toString() {
        return "GestionCoche{" +
                "listaCoches=" + listaCoches +
                '}';
    }

    public void agregarCoche(Coche coche) throws ErrorException {
        if (coche.getMatricula().length()>7){
            throw new ErrorException("La matricula no puede tener mas de 7 caracteres");
        }else if(coche.getMatricula().matches("^\\d.*")){
            throw  new ErrorException("La matricula no puede empezar por un número");
        }
        listaCoches.add(coche);
    }
}
