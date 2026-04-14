public class Gato extends Mascota {
    private boolean esDeInterior;

    //Constructor
    public Gato(String nombre, int edad, boolean esDeInterior){
        super(nombre, edad);
        this.esDeInterior = esDeInterior;
    }

    //Metodos
    @Override
    public void hacerSonido() {
        super.hacerSonido();
        System.out.println("Meoooow");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Es de interior? Respuesta: " + esDeInterior);
    }
}
