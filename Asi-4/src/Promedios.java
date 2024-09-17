import java.util.Scanner;

public class Promedios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[5];
        double suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un número decimal: ");
            if (scanner.hasNextDouble()) {
                numeros[i] = scanner.nextDouble();
                suma += numeros[i];
            } else {
                System.out.println("Por favor, ingrese un número decimal válido.");
                scanner.next(); // Limpiar el input incorrecto
                i--; // Repetir la iteración para obtener un número válido
            }
        }

        double promedio = suma / numeros.length;
        System.out.println("El promedio es: " + promedio);

        scanner.close();
    }
}
