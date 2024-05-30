public class VehiculoCarga extends Vehiculo {
    private int capacidadCarga;

    //constructor
    public VehiculoCarga(String marca, String modelo, int año, int kilometraje, int capacidadCarga){
        super(marca, modelo, año, kilometraje);
        this.capacidadCarga = capacidadCarga;
    }
    //getter and setter para capacidade de carga
    public int getCapacidadCarga (){
        return capacidadCarga;
    }
    public void setCapacidadCarga(int capacidadCarga){
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("capacidad de carga:" + capacidadCarga + "kg");
    }

}
