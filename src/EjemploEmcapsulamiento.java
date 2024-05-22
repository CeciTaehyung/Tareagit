public class EjemploEmcapsulamiento {
    public  static void main (String[]args){
        Estudiantes obj = new Estudiantes();
        obj.setNombre("Cecita");
        obj.setApellido("Arbizu");
        obj.setEdad(18);
        obj.setPeso(111);
        obj.setGenero("M");

        System.out.println("Name: " + obj.getNombre());
        System.out.println("Apellido: " + obj.getApellido());
        System.out.println("Edad: " + obj.getEdad());
        System.out.println("Peso: " + obj.getPeso());
        System.out.println("Genero: " + obj.getGenero());
        System.out.println("Hola bienvenidos");

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
