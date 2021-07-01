package ParcialFinal.Ejercicio3;

public class Estudiantes {
    private String nombre;
    private int edad;

    public Estudiantes(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void showInfo(){
        System.out.println("*** Informacion estudiante ***");
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);

    }
}
