public class Series {
    //Atributos
    String titulo;
    int Temporadas ;
    String genero;
    int anio_de_estreno;


   //Metodos
    //Constructor
    public Series(String titulo, int Temporadas, String genero, int anio_de_estreno ) {
        this.titulo = titulo;
        this.Temporadas = Temporadas;
        this.genero = genero;
        this.anio_de_estreno= anio_de_estreno;
    }

    //metodos personalizados
    public void imprimirs() {
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Temporadas: " + this.Temporadas);
        System.out.println("Genero: " + this.genero);
        System.out.println("Anio de estreno: " + this.anio_de_estreno);
    }

    //getters
    public String getTitulo() {
        return titulo;
    }
    public int getTemporadas() {
        return Temporadas;
    }
    public String getGenero() {
        return genero;
    }
    public int getAnio_de_estreno() {
        return anio_de_estreno;
    }
    //Vacio
    public  Series (){
    }
    //setters

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setTemporadas(int Temporadas) {
        this.Temporadas = Temporadas;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setAnio_de_estreno(int anio_de_estreno) {
        this.anio_de_estreno = anio_de_estreno;
    }

}


