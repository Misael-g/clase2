public class Auto {
    String Marca;
    int anio;
    String color;
    String motor;
    int capacidad_de_pasajeros;

    public Auto(String marca, int anio, String color, String motor, int capacidad_de_pasajeros) {
        Marca = marca;
        this.anio = anio;
        this.color = color;
        this.motor = motor;
        this.capacidad_de_pasajeros = capacidad_de_pasajeros;
    }
    public void imprimir(){
        System.out.println("------------------------------------------");
        System.out.println("                     Autos                ");
        System.out.println("La marca es: "+ this.Marca);
        System.out.println("El año es: " +this.anio);
        System.out.println("Su color es: "+this.color);
        System.out.println("El motor es de :"+this.motor);
        System.out.println("La capacidad es de "+this.capacidad_de_pasajeros);
        System.out.println("------------------------------------------");
        System.out.println();
    }
}