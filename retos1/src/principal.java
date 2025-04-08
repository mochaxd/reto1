import java.util.Scanner;
public class principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Recolectar los datos del paciente
        System.out.print("Ingrese el nombre del paciente: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la edad del paciente: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        System.out.print("Ingrese el número de expediente: ");
        String expediente = scanner.nextLine();

        // Crear el objeto Paciente con los datos ingresados
        paciente paciente = new paciente(nombre, edad, expediente);

        System.out.println("\n📋 Información del Paciente:");
        paciente.mostrarInformacion();

        scanner.close();
    }
}
