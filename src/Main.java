
import java.util.Scanner;
public class Cslculadora {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        //declarar variables num1 y num2
        int num1, num2;

        //mientras se ejecuta el codigo hara lo siguiente
        while (true) {
            System.out.print("ingresa primer número: ");
            num1= scanner.nextInt();

            System.out.print("ingresa segundo numero: ");
            num2= scanner.nextInt();
        }
        //mostrar menu opciones
        mostrarmenu();
        //pedir opcion a usuario
        System.out.print("ingrese opcion deseada");
        int opcion= scanner.nextInt();
            switch (opcion){
                case 1:
                    mostrarResultdo("Suma : ", num1 + num2);
                    break;
                case 2:
                    mostrarResultado("Resta : ", num1 - num2);
                    break;
                case 3:
                    mostrarResultado("División : ", num1 / num2);
                    break;
                case 4:
                    mostrarResultado("Mulriplicacioó : ", num1 * num2);
                    break;
                case  5:
                    mostrarMensaje("fin del programa");
                    return;
                default:
                    mostrarMensaje("opcion invalida");
            }
    }

    // funcion para mostrar el menu opciones
    private static void mostrarmenu(){

        System.out.println("===Menú===");
        System.out.println("1.  Sumar===");
        System.out.println("2.  Restar===");
        System.out.println("3.  Dividir===");
        System.out.println("4.  Mltiplicar===");
        System.out.println("5.  Salir===");


    }
    private static  void mostrarResultado(){

    }
}

