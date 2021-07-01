package ParcialFinal.Ejercicio1;
import java.util.Random;

public class Turista implements ITurista {
    private String nombre;
    private int montoDinero;
    private int ci;

    public Turista(String nombre, int montoDinero, int ci) {
        this.nombre = nombre;
        this.montoDinero = montoDinero;
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMontoDinero() {
        return montoDinero;
    }

    public void setMontoDinero(int montoDinero) {
        this.montoDinero = montoDinero;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    @Override
    public void visit(LaPaz laPaz) {
        Random rd= new Random();
        int numeroRadom=rd.nextInt(100)+1;
    }

    @Override
    public void visit(Cochabamba cochabamba) {

    }

    @Override
    public void visit(SantaCruz santaCruz) {

    }
}
