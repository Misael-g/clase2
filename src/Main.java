//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hola a todos \n");
       //--------------------------------------------------------------------------------------------------------------
        //para declarar el objeto
        //para instanciar una clase
        Libro libro1=new Libro("El resplandor","Stephen King ","De bolsillo ",600);
        Libro libro2=new Libro("Cien años de soledad","Gabriel García Márquez ","Sudamericana ",432);
        Libro libro3=new Libro("Don Quijote de la Mancha","Miguel de Cervantes ","Planeta ",1000);
        Libro libro4=new Libro("La casa de los espíritus","Isabel Allende ","Plaza & Janés ",448);
        Libro libro5=new Libro("El amor en los tiempos del cólera","Gabriel García Márquez ","Mondadori",368);
        Libro libro6=new Libro("Rayuela","Julio Cortázar","Seix Barral",576);

        libro1.imprimir();
        System.out.println(libro1.imprimircubierta());
        libro2.imprimir();
        System.out.println(libro2.imprimircubierta());
        libro3.imprimir();
        System.out.println(libro3.imprimircubierta());
        libro4.imprimir();
        System.out.println(libro4.imprimircubierta());
        libro5.imprimir();
        System.out.println(libro5.imprimircubierta());
        libro6.imprimir();
        System.out.println(libro6.imprimircubierta());

        //------------------------------------------------------------------------------------------------------

        Series serie1= new Series("Breaking Bad",5, "Drama, Crimen", 2088);
        Series serie2=new Series("Game of Thrones",8, "Fantasía, Drama", 2011);
        Series serie3=new Series("Stranger Things",4, "Ciencia Ficción, Terror", 2016);
        Series serie4=new Series ();

        System.out.println(serie1.getTitulo());
        System.out.println(serie2.getTemporadas());
        System.out.println(serie3.getGenero());
        System.out.println(serie1.getAnio_de_estreno());

        System.out.println(serie1.getAnio_de_estreno());
        serie1.setAnio_de_estreno(1900);
        System.out.println(serie1.getAnio_de_estreno());

        //-------------------------------------------------------------------------------------------------------------

        VideoJuegos juego1 =new VideoJuegos("Overwatch", "Multijugador","PC, PlayStation 4, Xbox One, Nintendo Switch", 2016);
        VideoJuegos juego2 =new VideoJuegos("Minecraft", "Un jugador / Multijugador","PC, PlayStation, Xbox, Nintendo Switch, dispositivos móviles", 2011);
        VideoJuegos juego3 =new VideoJuegos("Fortnite", "Multijugador","PC, PlayStation, Xbox, Nintendo Switch, dispositivos móviles", 2017);

        System.out.println(juego1.getTitulo());
        System.out.println(juego2.getTitulo());
        System.out.println(juego3.getTitulo());

        //-------------------------------------------------------------------------------------------------------------



    }
}