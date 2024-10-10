public class Pelicula {
    String titulo;
    String director;
    int anio;
    String clasificacion;

    public Pelicula(String titulo, String director, int anio, String clasificacion) {
        this.titulo = titulo;
        this.director = director;
        this.anio = anio;
        this.clasificacion = clasificacion;
    }
    public void imprimir(){
        System.out.println("------------------------------------------");
        System.out.println("                   Peliculas                ");
        System.out.println("El titulo de la pelicula es : "+ this.titulo);
        System.out.println("Fue dirigida por : "+ this.director);
        System.out.println("En el año: " + this.anio+" Año");
        System.out.println("Calificacion " + this.clasificacion);
        System.out.println("------------------------------------------");
        System.out.println();
    }
}
