public class VideoJuegos {
    //Atributos
    String titulo;
    String Modo_de_Juego ;
    String plataforma;
    int anio_de_estreno;

    //Metodos
    //Constructor
    public VideoJuegos(String titulo, String modo_de_Juego, String paltaforma, int anio_de_estreno) {
     this.titulo = titulo;
     this.Modo_de_Juego = modo_de_Juego;
     this.plataforma = paltaforma;
     this.anio_de_estreno = anio_de_estreno;
    }

    //getters
    public String getTitulo() {
        return titulo;
    }
    public String getModo_de_Juego() {
        return Modo_de_Juego;
    }
    public String getPlataforma() {
        return plataforma;
    }
    public int getAnio_de_estreno() {
        return anio_de_estreno;
    }
    //Vacio
    public VideoJuegos() {
    }

    //Setter
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setModo_de_Juego(String modo_de_Juego) {
        this.Modo_de_Juego = modo_de_Juego;
    }
    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
    public void setAnio_de_estreno(int anio_de_estreno) {
        this.anio_de_estreno = anio_de_estreno;
    }

    //metodos personalizados
    public void imprimir() {
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Modo_de_Juego: " + this.Modo_de_Juego);
        System.out.println("Plataforma: " + this.plataforma);
        System.out.println("Anio de estreno: " + this.anio_de_estreno);

    }


}