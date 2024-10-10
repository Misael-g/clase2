public class Materias {
    String nombre;
    String codigo;
    int creditos;
    String requisitos;

    public Materias(String nombre, String codigo, int creditos, String requisitos) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditos = creditos;
        this.requisitos = requisitos;
    }

    public void imprimir(){
        System.out.println("------------------------------------------");
        System.out.println("                   Materias                ");
        System.out.println("La materia es : "+this.nombre);
        System.out.println("Su código es : "+this.codigo);
        System.out.println("La materia tiene "+this.creditos+" creditos");
        System.out.println("Tiene como requisito "+this.requisitos);
        System.out.println("------------------------------------------");
        System.out.println();
    }
}

