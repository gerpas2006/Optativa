package ejercicio10;

import java.util.List;

public class Figura {

    public double calcularArea(){
        return 0;
    };

    public double calcularVolumen(){
        return 0;
    };

    public double calcularMediaDeLasAreas(List<Figura> list){
        double media=0;
        for (int i = 0; i < list.size(); i++) {
            media+=list.get(i).calcularArea()/list.size();
        }
        return media;

    }


}
