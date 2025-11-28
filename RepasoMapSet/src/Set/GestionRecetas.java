package Set;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class GestionRecetas {

    Set<Recetas> setRecetas;

    public GestionRecetas(Set<Recetas> setRecetas) {
        this.setRecetas = (Set<Recetas>) setRecetas;
    }

    public Set<Recetas> getSetRecetas() {
        return setRecetas;
    }

    public void setSetRecetas(Set<Recetas> setRecetas) {
        this.setRecetas = setRecetas;
    }

    @Override
    public String toString() {
        return "GestionRecetas{" +
                "setRecetas=" + setRecetas +
                '}';
    }

    public void findAll(){
        for (Recetas rec : setRecetas){
            System.out.println(rec);
        }
    }

    public Recetas findById(Long id){
        for (Recetas recetas: setRecetas){
            if (recetas.getId()==id){
                return recetas;
            }
        }
        return null;
    }








}
