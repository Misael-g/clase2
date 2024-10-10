public class Cancion {
    String nombrede_laCancion;
    String artista;
    String album;
    float duracion;

    public Cancion(String nombrede_laCancion, String artista, String album, float duracion) {
        this.nombrede_laCancion = nombrede_laCancion;
        this.artista = artista;
        this.album = album;
        this.duracion = duracion;
    }
    public void imprimir(){
        System.out.println("------------------------------------------");
        System.out.println("                     Canciones                ");
        System.out.println("El nombre de la cancion es: "+this.nombrede_laCancion);
        System.out.println("Su artista es: "+this.artista);
        System.out.println("Pertenece al album "+this.album);
        System.out.println("La duracion es "+this.duracion+ " minutos");
        System.out.println("------------------------------------------");
        System.out.println();
    }
}
