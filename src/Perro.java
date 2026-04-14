public class Perro extends Mascota{
    private String raza;

    //constructor
    public Perro(String nombre, int edad, String raza){
        super(nombre, edad);
        this.raza = raza;
    }

    //metodos
    @Override
    public void hacerSonido() {
        super.hacerSonido();
        System.out.println("Guau guau");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Y es raza " + raza);
    }
}