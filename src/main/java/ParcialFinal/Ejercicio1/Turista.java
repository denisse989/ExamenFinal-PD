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
        laPaz.showInfo();
        Random rd= new Random();
        int numeroRadom=rd.nextInt(100)+1;
        if(montoDinero>=100) {
            int gastar = montoDinero - numeroRadom;
            System.out.println(nombre+" gastara: "+gastar);
            laPaz.aumentarDinero(gastar);
            laPaz.showInfo();
            this.setMontoDinero(montoDinero-gastar);
        }else {
            System.out.println("NO CUENTA CON EL MONTO SUFICIENTE ");
        }
    }

    @Override
    public void visit(Cochabamba cochabamba) {
        cochabamba.showInfo();
        int gastar=cochabamba.getNumeroHabitantes()*10/100;
        if(montoDinero>=gastar) {
            System.out.println(nombre+" gastara: "+gastar);
            cochabamba.aumentarDinero(gastar);
            cochabamba.showInfo();
            this.setMontoDinero(montoDinero-gastar);
        }else {
            System.out.println("NO CUENTA CON EL MONTO SUFICIENTE ");
        }

    }

    @Override
    public void visit(SantaCruz santaCruz) {
        santaCruz.showInfo();
        int gastar=santaCruz.getNúmeroProvincias()*50/100;
        if(montoDinero>=gastar) {
            System.out.println(nombre+" gastara: "+gastar);
            santaCruz.aumentarDinero(gastar);
            santaCruz.showInfo();
            this.setMontoDinero(montoDinero-gastar);
        }else {
            System.out.println("NO CUENTA CON EL MONTO SUFICIENTE ");
        }

    }
}
