import java.util.Scanner;
public class CondicionalesIf {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("ingrese número: ");
        int numero = scanner.nextInt();

        //verifica que numero es positivo
        if (numero > 0){
            System.out.println("El número es positivo");
        }
        if (numero < 0){
            System.out.println("el número es negativo");
        }
        //verifica numero par
        if (numero !=0){
            if (numero % 2 == 0){
                System.out.println("El número ingresado es par");
            } else {
                System.out.println("El número ingresado es impar");
            }
        }
        else {
            System.out.println("el numero ingresado es cero");
        }
        scanner.close();

    }
}
