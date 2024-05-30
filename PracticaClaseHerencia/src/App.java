public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Auto auto = new Auto ("Toyota", "Corolla", 2020, 15000, 5, "Gasolina");
        Camion camion = new Camion ("Volvo", "FH", 2019, 75000, 20000, 4);

        System.out.println("Informacion del auto:");
        auto.mostrarInfo();

        System.out.println("\n Informacion del camion");
        camion.mostrarInfo();
    }


            
      
    
}
