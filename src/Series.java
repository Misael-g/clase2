public class Series {
    //Atributos
    String titulo;
    int Temporadas ;
    String genero;
    int anio_de_estreno;


   //Metodos

    public Series(String titulo, int Temporadas, String genero, int anio_de_estreno ) {
        this.titulo = titulo;
        this.Temporadas = Temporadas;
        this.genero = genero;
        this.anio_de_estreno= anio_de_estreno;
    }
    public void imprimirs() {
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Temporadas: " + this.Temporadas);
        System.out.println("Genero: " + this.genero);
        System.out.println("Anio de estreno: " + this.anio_de_estreno);
    }
}


