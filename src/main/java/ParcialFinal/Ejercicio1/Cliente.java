package ParcialFinal.Ejercicio1;


public class Cliente {
    public static  void main(String[]ags){
        LaPaz laPaz=new LaPaz("LA PAZ",100,100,"FRIO",100);
        Cochabamba cochabamba= new Cochabamba("COCHABAMBA",100,100,"TIBIO",100);
        SantaCruz santaCruz=new SantaCruz("SANTA CRUZ",100,100,"CALIENTE",100);

        Turista turista=new Turista("JUAN",200,123);
        laPaz.accept(turista);
        cochabamba.accept(turista);
        santaCruz.accept(turista);
    }
}
