import java.util.Scanner;

public class EjemploEmcapsulamiento {
    public  static void main (String[]args){
        Estudiantes obj = new Estudiantes();
        Scanner po = new Scanner(System.in);

        String a1, a2, a3;
        int b; double c;

        System.out.println("Escribe la informacion del libro.");

        System.out.println("Tu Nombre: ");
        a1 = po.nextLine();
        obj.setNombre(a1);

        System.out.println("Tu apellido: ");
        a2 = po.nextLine();
        obj.setApellido(a2);

        System.out.println("Tu Edad: ");
        b = po.nextInt();
        obj.setEdad(b);

        System.out.println("Tu peso: ");
        c = po.nextDouble();
        obj.setPeso(c);

        System.out.println("Tu genero: ");
        a3 = po.next();
        obj.setGenero(a3);

        System.out.println();

        System.out.println("Name: " + obj.getNombre());
        System.out.println("Apellido: " + obj.getApellido());
        System.out.println("Edad: " + obj.getEdad());
        System.out.println("Peso: " + obj.getPeso());
        System.out.println("Genero: " + obj.getGenero());
        System.out.println("Hola bienvenidos");
        System.out.println("Como estas? " + obj.getNombre());

    }
}

class  Estudiantes {
    private String nombre;
    private String apellido;
    private int edad;
    private double peso;
    private String genero;

    public Estudiantes(){}

    public  Estudiantes(String pNombre, String pApellido, int pEdad, double pPeso, String pGenero){
        nombre = pNombre;
        apellido = pApellido;
        edad = pEdad;
        peso = pPeso;
        genero = pGenero;
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return  apellido;
    }

    public int getEdad(){
        return edad;
    }

    public  double getPeso(){
        return peso;
    }

    public  String getGenero(){
        return genero;
    }

    public void setNombre(String pNombre) {
        this.nombre = pNombre;
    }

    public void setApellido(String pApellido) {
        this.apellido = pApellido;
    }

    public void setEdad(int pEdad) {
        this.edad = pEdad;
    }

    public void setPeso(double pPeso) {
        this.peso = pPeso;
    }

    public void setGenero(String pGenero) {
        this.genero = pGenero;
    }

}
