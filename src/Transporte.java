public class Transporte {
    String tipodeTransporte;
    String capacidad;
    String consumo;
    float precio;

    public Transporte(String tipodeTransporte, String capacidad, String consumo, float precio) {
        this.tipodeTransporte = tipodeTransporte;
        this.capacidad = capacidad;
        this.consumo = consumo;
        this.precio = precio;
    }
    public void imprimir(){
        System.out.println("------------------------------------------");
        System.out.println("                     Transporte                ");
        System.out.println("Tipo de transporte : "+ this.tipodeTransporte);
        System.out.println("Capacidad "+ this.capacidad+" personas");
        System.out.println("Consumo " + this.consumo);
        System.out.println("precio $" + this.precio);
        System.out.println("------------------------------------------");
        System.out.println();
    }
}
