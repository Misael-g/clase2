public class VideoJuegos {
    //Atributos
    String titulo;
    String Modo_de_Juego ;
    String plataforma;
    int anio_de_estreno;


    //Metodos

    public VideoJuegos(String titulo, String modo_de_Juego, String paltaforma, int anio_de_estreno) {
     this.titulo = titulo;
     this.Modo_de_Juego = modo_de_Juego;
     this.plataforma = paltaforma;
     this.anio_de_estreno = anio_de_estreno;
    }
    public void imprimirv() {
        System.out.println(this.titulo);
        System.out.println(this.Modo_de_Juego);
        System.out.println(this.plataforma);
        System.out.println(this.anio_de_estreno);

    }
}