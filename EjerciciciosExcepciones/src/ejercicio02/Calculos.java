package ejercicio02;

public class Calculos {


    public double covertirCelsiusAFahrenheit(double grados) throws TemperaturaException{
        double fahrenheit = 0.0;

        if (grados<=-273){
            throw new TemperaturaException("no puede haber temperaturas menores a -273 ºC");
        }
        fahrenheit = (grados * 9 / 5) + 32;

        return fahrenheit;

    }
}
