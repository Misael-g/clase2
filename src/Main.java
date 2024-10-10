//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hola a todos \n");

        //para declarar el objeto
        //para instanciar una clase
        Libro libro1=new Libro("El resplandor","Stephen King ","De bolsillo ",600);
        Libro libro2=new Libro("Cien años de soledad","Gabriel García Márquez ","Sudamericana ",432);
        Libro libro3=new Libro("Don Quijote de la Mancha","Miguel de Cervantes ","Planeta ",1000);
        Libro libro4=new Libro("La casa de los espíritus","Isabel Allende ","Plaza & Janés ",448);
        Libro libro5=new Libro("El amor en los tiempos del cólera","Gabriel García Márquez ","Mondadori",368);
        Libro libro6=new Libro("Rayuela","Julio Cortázar","Seix Barral",576);

        libro1.imprimir();
        libro1.imprimir_cubierta();
        libro2.imprimir();
        libro2.imprimir_cubierta();
        libro3.imprimir();
        libro3.imprimir_cubierta();
        libro4.imprimir();
        libro4.imprimir_cubierta();
        libro5.imprimir();
        libro5.imprimir_cubierta();
        libro6.imprimir();
        libro6.imprimir_cubierta();


    }
}