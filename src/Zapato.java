public class Zapato {
    String marca;
    int tamanio;
    String material;
    String tipo;

    public Zapato(String marca, int tamanio, String material, String tipo) {
        this.marca = marca;
        this.tamanio = tamanio;
        this.material = material;
        this.tipo = tipo;
    }

    public void imprimir(){
        System.out.println("------------------------------------------");
        System.out.println("                     Zapatos                ");
        System.out.println("Marca : "+ this.marca);
        System.out.println("Tamaño: "+ this.tamanio);
        System.out.println("Material: " + this.material);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("------------------------------------------");
        System.out.println();
    }
}

