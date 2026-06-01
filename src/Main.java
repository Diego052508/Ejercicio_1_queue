import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        // Crear la cola de clientes
        Queue<String> clientes = new LinkedList<>();

        // Agregar 8 clientes
        clientes.offer("Ana");
        clientes.offer("Carlos");
        clientes.offer("María");
        clientes.offer("José");
        clientes.offer("Lucía");
        clientes.offer("Pedro");
        clientes.offer("Sofía");
        clientes.offer("Miguel");
        clientes.offer("Samuel");
        clientes.offer("Diego");

        System.out.println("=== CLIENTES EN ESPERA ===");
        System.out.println("Cliente al frente de la cola: " + clientes.peek());
        System.out.println("Cantidad de clientes: " + clientes.size());

        System.out.println("\n=== ATENCIÓN DE CLIENTES ===");

        // Atender clientes hasta vaciar la cola
        while (!clientes.isEmpty()) {

            System.out.println("\nCliente en espera: " + clientes.peek());

            String atendido = clientes.poll();

            System.out.println("Cliente atendido: " + atendido);
            System.out.println("Clientes restantes: " + clientes.size());
        }

        System.out.println("\nNo quedan clientes en la cola.");
    }
}