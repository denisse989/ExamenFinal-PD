package ParcialFinal.Ejercicio5;

public class Memoria implements ICelular{
    ICelular celular;
    int memoriaE;
    int costo;

    public Memoria(ICelular celular, int memoriaE,int costo) {
        System.out.println("Se incorporó una memoria Externa");
        System.out.println(" ");
        this.celular = celular;
        this.memoriaE = memoriaE;
        this.costo=costo;
        this.setPrecio(this.celular.precio() + costo);
        this.setAlmacenamiento(this.celular.getAlmacenamiento() + memoriaE);

    }

    @Override
    public void showInfo() {
        celular.showInfo();

    }

    @Override
    public int getRam() {
        return celular.getRam();
    }

    @Override
    public void setRam(int ram) {
        celular.setRam(ram);

    }

    @Override
    public int getCpu() {
        return celular.getCpu();
    }

    @Override
    public void setCpu(int cpu) {
        celular.setCpu(cpu);

    }

    @Override
    public int getAlmacenamiento() {
        return celular.getAlmacenamiento();
    }

    @Override
    public void setAlmacenamiento(int almacenamiento) {
        celular.setAlmacenamiento(almacenamiento);

    }

    @Override
    public int precio() {

        return celular.precio();
    }

    @Override
    public void setPrecio(int precio) {
        celular.setPrecio(precio);

    }

}
