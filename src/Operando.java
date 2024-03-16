import java.util.Scanner;
public class Operando {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario los numeros
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        // Calcular la suma
        double suma = numero1 + numero2;

        // Mostrar la suma
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);

        scanner.close();
    }
}

