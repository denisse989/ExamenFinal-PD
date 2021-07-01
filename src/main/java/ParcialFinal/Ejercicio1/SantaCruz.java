package ParcialFinal.Ejercicio1;

public class SantaCruz implements IDepartamento{
    private String nombre;
    private int númeroProvincias;
    private int numeroHabitantes;
    private String clima;
    private double dineroTurismo;

    public SantaCruz(String nombre, int númeroProvincias, int numeroHabitantes, String clima, double dineroTurismo) {
        this.nombre = nombre;
        this.númeroProvincias = númeroProvincias;
        this.numeroHabitantes = numeroHabitantes;
        this.clima = clima;
        this.dineroTurismo = dineroTurismo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNúmeroProvincias() {
        return númeroProvincias;
    }

    public void setNúmeroProvincias(int númeroProvincias) {
        this.númeroProvincias = númeroProvincias;
    }

    public int getNumeroHabitantes() {
        return numeroHabitantes;
    }

    public void setNumeroHabitantes(int numeroHabitantes) {
        this.numeroHabitantes = numeroHabitantes;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public double getDineroTurismo() {
        return dineroTurismo;
    }

    public void setDineroTurismo(double dineroTurismo) {
        this.dineroTurismo = dineroTurismo;
    }

    @Override
    public void accept(ITurista visitante) {
        visitante.visit(this);
    }

    @Override
    public void showInfo() {
        System.out.println(" **** INFORMACION ****");
        System.out.println("Departamento: "+nombre);
        System.out.println("Numero Habitantes: "+numeroHabitantes);
        System.out.println("Numero Provincias: "+númeroProvincias);
        System.out.println("Clima: "+clima);
        System.out.println("Dinero por Turismo: "+dineroTurismo);
        System.out.println(" ");
    }
    @Override
    public void aumentarDinero(int dinero) {
        this.setDineroTurismo(dineroTurismo+dinero);
    }
}
