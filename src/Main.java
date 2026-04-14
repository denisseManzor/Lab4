import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del perro: ");
        String nombrePerro = sc.nextLine();

        System.out.println("Ingrese la edad del perro: ");
        int edadPerro = sc.nextInt();

        sc.nextLine();
        System.out.println("ingrese la raza del perro: ");
        String raza = sc.nextLine();

        Perro perro = new Perro(nombrePerro, edadPerro, raza);

        System.out.println("Ingrese nombre del gato: ");
        String nombreGato = sc.nextLine();

        System.out.println("Ingrese edad del gato");
        int edadGato = sc.nextInt();

        System.out.println("Su gato es de interior? (True para si, y False para no)");
        boolean esDeInterior = sc.nextBoolean();

        Gato gato = new Gato(nombreGato, edadGato, esDeInterior);

        perro.mostrarInfo();
        perro.hacerSonido();
        gato.mostrarInfo();
        gato.hacerSonido();
    }
}