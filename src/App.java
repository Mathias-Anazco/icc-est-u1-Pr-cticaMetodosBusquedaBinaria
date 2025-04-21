import java.util.Scanner;
import models.Persona;
import controllers.MetodoOrdenamiento;
import controllers.MetodoBinario;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de personas del listado: ");
        int n = sc.nextInt();
        Persona[] personas = new Persona[n];

        for (int i = 0; i < n; i++){
            System.out.print("\nIngrese el nombre de la persona " + (i + 1) + ": ");
            String nombre = sc.next();
            System.out.print("Ingrese la edad de la persona " + (i + 1) + ": ");
            int edad = sc.nextInt();
            personas[i] = new Persona(edad, nombre);
        }
        MetodoOrdenamiento.MetodoBurbuja(personas);

        System.out.print("\nIngrese la edad a buscar: ");
        int edadABuscar = sc.nextInt();
        MetodoBinario.buscarPersonaPorEdad(personas, edadABuscar);
    }
}
