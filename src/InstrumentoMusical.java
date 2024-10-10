public class InstrumentoMusical {
    String nombre;
    String material;
    String origen;
    float precio;

    public InstrumentoMusical(String nombre, String material, String origen, float precio) {
        this.nombre = nombre;
        this.material = material;
        this.origen = origen;
        this.precio = precio;
    }

    public void imprimir(){
        System.out.println("------------------------------------------");
        System.out.println("            InstrumentoMusical                ");
        System.out.println("El instrumento muscal es: "+this.nombre);
        System.out.println("El material es : "+this.material);
        System.out.println("Su origen es de: "+this.origen);
        System.out.println("Tiene un precio de  $"+this.precio);
        System.out.println("------------------------------------------");
        System.out.println();
    }

}
