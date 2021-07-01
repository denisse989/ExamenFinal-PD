package ParcialFinal.Ejercicio2;
import java.util.Random;

public class CuadraTrackElectrico implements ICuadraTrackElectrico{
    int capacidad;

    @Override
    public void cargar(int capacidad) {
        this.capacidad=capacidad;
        System.out.println("Nueva capacidad cuadratrack eléctrico: "+this.capacidad);
        System.out.println(" ");

    }

    @Override
    public int estadoDeElectricidad() {
        Random rd = new Random();
        int numero = rd.nextInt(9)+1;
        System.out.println("Estado de electricidad de Cuadratrack eléctrico: "+numero);
        System.out.println(" ");
        return numero;
    }
}
