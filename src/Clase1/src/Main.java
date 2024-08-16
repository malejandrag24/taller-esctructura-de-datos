//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();

        Scanner entrada = new Scanner(System.in); // Para ingresar datos por consola

        // Añadir nombres a la lista
        nombres.add("Alejandra Gonzalez");
        nombres.add("Milena Cortes");
        nombres.add("Jaime Gonzalez");
        nombres.add("Fabiola Guerra");
        nombres.add("Antonio Banderas");

        // Imprimir los nombres en la lista
        System.out.println("Nombres en la lista:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        // Buscar por el nombre
        System.out.println("Ingrese el nombre a buscar: ");
        String nombreBuscar = entrada.nextLine();

        // Buscar el nombre en la lista
        boolean nombreEncontrado = buscarNombre(nombres, nombreBuscar);

        // Mostrar el resultado de la búsqueda
        if (nombreEncontrado) {
            System.out.println("El nombre '" + nombreBuscar + "' sí existe en la lista.");
        } else {
            System.out.println("No se encontró ningún contacto con ese nombre.");
        }

        // Pedir al usuario que ingrese un nombre para agregar
        System.out.print("Ingrese el nombre a agregar: ");
        String nombreAgregar = entrada.nextLine();

        // Agregar el nombre solo si no está ya en la lista
        if (nombres.contains(nombreAgregar)) {
            System.out.println("El nombre ya existe en la lista.");
        } else {
            agregarNombre(nombres, nombreAgregar);
            System.out.println("Nombre agregado con éxito.");
        }

        // Mostrar la lista actualizada
        System.out.println("Lista actualizada:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        entrada.close(); // Cerrar el Scanner al final
    }

    // Método para buscar el nombre en la lista
    public static boolean buscarNombre(List<String> nombres, String nombre) {
        for (String n : nombres) {
            if (n.equalsIgnoreCase(nombre)) {
                return true; // Nombre encontrado
            }
        }
        return false; // Nombre no encontrado
    }

    // Método para agregar un nombre a la lista
    public static void agregarNombre(List<String> nombres, String nombre) {
        nombres.add(nombre);
    }
}

