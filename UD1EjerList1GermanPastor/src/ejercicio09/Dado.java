package ejercicio09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Dado {

    private List<Integer> listNum=new ArrayList<>();


    public Dado(List<Integer> listNum) {
        this.listNum = listNum;
    }

    public List<Integer> getListNum() {
        return listNum;
    }

    public void setListNum(List<Integer> listNum) {
        this.listNum = listNum;
    }

    @Override
    public String toString() {
        return "Dado{" +
                "listNum=" + listNum +
                '}';
    }

    public List<Integer> numAleatorio(int min,int max){
        Random rnd = new Random(System.nanoTime());
        for (int i = 0; i < 10; i++) {
            listNum.add(rnd.nextInt(max - min + 1) + min);
        }
        return listNum;
    }

    public int numMayor(){
        int mayor= listNum.getFirst();
        for (int i = 0; i < listNum.size(); i++) {
            if(listNum.get(i)>mayor){
                mayor=listNum.get(i);
            }
        }
        return mayor;
    }

    public int numMenor(){
        int menor= listNum.getFirst();
        for (int i = 0; i < listNum.size(); i++) {
            if (listNum.get(i)<menor) {
                menor=listNum.get(i);
            }
        }
        return menor;
    }

   public List<Integer> numeroMasRepetido(){
        List<Integer> masRepetido= new ArrayList<>();
        int numMaxRepetido=0;
        int resultado=0;
       numMaxRepetido = listNum.stream()
               .mapToInt(n-> (int)listNum.stream().filter(d-> d.equals(n)).count())
               .max().orElse(0);
       for(int numero:listNum){
           resultado= (int) listNum.stream().filter(n -> n.equals(numero)).count();
           if(resultado==numMaxRepetido && !masRepetido.contains(numero)){
                masRepetido.add(numero);
           }
       }
       return masRepetido;
    }

    // Suma todos los números de la lista
    public int sumarNumeros() {
        int suma = 0;
        for (int num : listNum) {
            suma += num;
        }
        return suma;
    }

    public  int contarNumero(int numero){
        int cont=0;
        for(int i : listNum){
            if(i==numero){
                cont++;
            }
        }
        return cont;
    }
}
