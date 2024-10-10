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

        libro1.imprimir();
        System.out.println(libro1.imprimircubierta());
        libro2.imprimir();
        System.out.println(libro2.imprimircubierta());
        libro3.imprimir();
        System.out.println(libro3.imprimircubierta());


        //-----------------------------------------------------------------------------------------------------
        //Series
        Series serie1= new Series("Breaking Bad",5, "Drama, Crimen", 2088);
        Series serie2=new Series("Game of Thrones",8, "Fantasía, Drama", 2011);
        Series serie3=new Series("Stranger Things",4, "Ciencia Ficción, Terror", 2016);
        /*
        System.out.println(serie1.getTitulo());
        System.out.println(serie2.getTemporadas());
        System.out.println(serie3.getGenero());
        System.out.println(serie1.getAnio_de_estreno());

        System.out.println(serie1.getAnio_de_estreno());
        serie1.setAnio_de_estreno(1900);
        System.out.println(serie1.getAnio_de_estreno());*/
        serie1.imprimirs();
        serie2.imprimirs();
        serie3.imprimirs();

        //-------------------------------------------------------------------------------------------------------------
        //videoJuegos
        VideoJuegos juego1 =new VideoJuegos("Overwatch", "Multijugador","PC, PlayStation 4, Xbox One, Nintendo Switch", 2016);
        VideoJuegos juego2 =new VideoJuegos("Minecraft", "Un jugador / Multijugador","PC, PlayStation, Xbox, Nintendo Switch, dispositivos móviles", 2011);
        VideoJuegos juego3 =new VideoJuegos("Fortnite", "Multijugador","PC, PlayStation, Xbox, Nintendo Switch, dispositivos móviles", 2017);
        juego1.imprimir();
        juego2.imprimir();
        juego3.imprimir();

        /*
        System.out.println(juego1.getTitulo());
        System.out.println(juego2.getTitulo());
        System.out.println(juego3.getTitulo());*/

        //-------------------------------------------------------------------------------------------------------------
        //Auto
        Auto auto1= new Auto("Toyota Corolla", 2023,"Blanco","Gasolina, 1.8L",5);
        Auto auto2= new Auto("Honda CR-V", 2023,"Negro","Híbrido, 2.0L",5);

        auto1.imprimir();
        auto2.imprimir();

        //-------------------------------------------------------------------------------------------------------------
        //Cancion
        Cancion cancion1=new Cancion("Blinding Lights","The Weeknd","After Hours",  3.20f);
        Cancion cancion2=new Cancion("Shape of You","TEd Sheeran","÷ (Divide)", 3.53f);
        cancion1.imprimir();
        cancion2.imprimir();
        //-------------------------------------------------------------------------------------------------------------
        //Instrumento Musical
        InstrumentoMusical intrumento1=new InstrumentoMusical("Guitarra","Madera","España",  700.50f);
        InstrumentoMusical intrumento2=new InstrumentoMusical("Batería","Madera y plástico","Estados Unidos", 1.200f);
        intrumento1.imprimir();
        intrumento2.imprimir();
        //-------------------------------------------------------------------------------------------------------------
        //Materias
        Materias materia1=new Materias("Química Orgánica","QUI201",3,  "Química General");
        Materias materia2=new Materias("Historia del Arte","ART305",2, "Ninguno");
        materia1.imprimir();
        materia2.imprimir();
        //-------------------------------------------------------------------------------------------------------------
        //Peliculas
        Pelicula pelicula1=new Pelicula("Inception","Christopher Nolan",2010,  "PG-13");
        Pelicula pelicula2=new Pelicula("The Godfather","Francis Ford Coppola",1972, "R");
        pelicula1.imprimir();
        pelicula2.imprimir();
        //-------------------------------------------------------------------------------------------------------------
        //Personas
        Persona persona1=new Persona("Misal Eduardo Garcia Briones",20,"M",  "Ecuatoriano");
        Persona persona2=new Persona("Ana Elizabeht Gómez Toro",25,"F", "Española");
        persona1.imprimir();
        persona2.imprimir();
        //-------------------------------------------------------------------------------------------------------------
        //Transporte
        Transporte transporte1=new Transporte("Automóvil","5 pasajeros","15 km/l",  20.000f);
        Transporte transporte2=new Transporte("Bicicleta","1 pasajero","N/A", 1.200f);
        transporte1.imprimir();
        transporte2.imprimir();


        //-------------------------------------------------------------------------------------------------------------
        //Personas
        Zapato zapato1=new Zapato("Nike",42,"Tela y sintético",  "Deportivo");
        Zapato zapato2=new Zapato("Clarks",40,"Cuero", "Casual");
        zapato1.imprimir();
        zapato2.imprimir();
















    }
}