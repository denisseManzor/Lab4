public class Mascota {
    protected String nombre;
    protected int edad;

    //Constructor
    public Mascota(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    //metodos
    public void hacerSonido(){
        System.out.println("La Mascota hace...");
    }

    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre + ", edad: " + edad);
    }
}