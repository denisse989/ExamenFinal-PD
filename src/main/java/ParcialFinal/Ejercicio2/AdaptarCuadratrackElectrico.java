package ParcialFinal.Ejercicio2;

public class AdaptarCuadratrackElectrico implements ICuadratrack {
    ICuadraTrackElectrico cuadraTrackElectrico;


    public AdaptarCuadratrackElectrico(ICuadraTrackElectrico cuadraTrackElectrico) {
        this.cuadraTrackElectrico = cuadraTrackElectrico;
    }


    @Override
    public void llenarGasolina(int capacidad) {
        System.out.println("Adaptando llenar gasolina");
        cuadraTrackElectrico.cargar(capacidad);
    }


    @Override
    public int estadoCombustible() {
        System.out.println("Adaptando estado combustible");
        int estado = cuadraTrackElectrico.estadoDeElectricidad()*5;
        System.out.println("Nuevo estado del combustible: "+estado);
        return estado;
    }




}
