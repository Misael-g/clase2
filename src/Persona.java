public class Persona {
    String nombresCompleto;
    int edad;
    String genero;
    String nacionalidad;

    public Persona(String nombresCompleto, int edad, String genero, String nacionalidad) {
        this.nombresCompleto = nombresCompleto;
        this.edad = edad;
        this.genero = genero;
        this.nacionalidad = nacionalidad;
    }
    public void imprimir(){
        System.out.println("------------------------------------------");
        System.out.println("                     Personas                ");
        System.out.println("Nombre completo : "+ this.nombresCompleto);
        System.out.println("Su edad es : "+ this.edad+" Años");
        System.out.println("Género " + this.genero);
        System.out.println("Nacionalidad " + this.nacionalidad);
        System.out.println("------------------------------------------");
        System.out.println();
    }

}
