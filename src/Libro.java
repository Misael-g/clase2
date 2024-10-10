public class Libro {
    //Atributos
    String titulo;
    String autor;
    String editorial;
    int paginas;

    //métodos
    //una clase tiene que terner el metodo constructor siempre
    //Constructor
    public Libro(String titulo, String autor, String editorial, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.paginas = paginas;
    }

    public void imprimir (){
        System.out.println("------------------------------------------");
        System.out.println("                     Libro                ");
        System.out.println("El libro es: "+ this.titulo);
        System.out.println("El autor es: "+ this.autor);
        System.out.println("La editorial es: " + this.editorial);
        System.out.println("El número de paginas es: " + this.paginas);
        System.out.println("------------------------------------------");
        System.out.println();
    }

    public int imprimircubierta(){
        return this.paginas+5;
    }

}
