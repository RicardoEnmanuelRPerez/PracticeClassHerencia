public class Auto extends VehiculoPasajeros{
    private String tipoCombustible;

    public Auto (String marca, String modelo, int año, int kilometraje, int numPasajeros, String tipoCombustible){
        super(marca, modelo, año, kilometraje, numPasajeros);
        this.tipoCombustible = tipoCombustible;

    }

    public String getTipoCombustible(){
        return tipoCombustible;
    }
    public void setTipoCombustible(String tipoCombustible){
        this.tipoCombustible = tipoCombustible;
    }
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("tipo de combustible:" + tipoCombustible);
    }
    
}
