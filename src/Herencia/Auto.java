package Herencia;

public class Auto extends Vehiculo {

    private  boolean descapotable;
    public  void bajar(){
        System.out.println("Bajaste");
    }
    public void subir(){
        System.out.println("Subiste");
    }

    public Auto() {
    }

    public Auto(String duenio, int ruedas, int puertas, boolean descapotable) {
        super(duenio, ruedas, puertas);
        this.descapotable = descapotable;
    }

    @Override
    public void caracteristicas() {
        System.out.println("Puertas: " + this.getPuertas());
        System.out.println("Ruedas: " + this.getRuedas());
        System.out.println("Propietario: " + this.getDuenio());
        if (descapotable){
            System.out.println("Es descapotable");
        }
    }
}
