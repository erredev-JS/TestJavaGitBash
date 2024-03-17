package Herencia;

public class Camion extends Vehiculo {

    private float carga;




    public void cargar(){
        System.out.println("Cargado");
    }

    public Camion(float carga) {
        this.carga = carga;
    }

    public Camion(String duenio, int ruedas, int puertas, float carga) {
        super(duenio, ruedas, puertas);
        this.carga = carga;
    }

}
