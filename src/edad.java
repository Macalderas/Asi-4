
import java.util.Scanner;
public class edad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        System.out.println(edad >= 18 ? "Eres mayor de edad." : "No eres mayor de edad.");

        scanner.close();
    }
}


