
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main clase = new Main();

        while (true) {
            System.out.println("ingrese el primer número: ");
            // si usuario ingresa numero
            if (scanner.hasNextInt()) {
                int numero1 = scanner.nextInt();
                System.out.println(calcularNumeroPar(numero1));

            } else {
                System.out.println("El dato ingresado no es un numero");
                break;
            }

        }
    }
    //funcion calcular resto de una division de dos numeros
    //si el resto es cero, es par, sino es impar
    public static String calcularNumeroPar(int numero1 ){
        int resultado = 0;
        String esPar = "es impar";
        resultado = numero1 % 2;
        if (resultado == 0){
            return "es par";
        }
        return esPar;
    }
}
