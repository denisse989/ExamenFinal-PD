package ParcialFinal.Ejercicio2;


public class Cliente {
    public static  void main(String[]ags){
        ICuadratrack cuadratrack1 = new Gasolina();
        ICuadratrack cuadratrack2 = new Diesel();
        ICuadratrack cuadratrack3 = new GasolinaEspecial();

        ICuadratrack adaptarCuadratrackElectrico = new AdaptarCuadratrackElectrico(new CuadraTrackElectrico());

        cuadratrack1.estadoCombustible();
        cuadratrack1.llenarGasolina(50);

        cuadratrack2.estadoCombustible();
        cuadratrack2.llenarGasolina(20);

        cuadratrack3.estadoCombustible();
        cuadratrack3.llenarGasolina(30);

        adaptarCuadratrackElectrico.estadoCombustible();
        adaptarCuadratrackElectrico.llenarGasolina(20);


    }
}
