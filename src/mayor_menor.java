
import java.util.Scanner;
class mayor_menor {

    public static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa tu edad:");


        int edadUsuario = Integer.parseInt(scanner.nextLine());


        if (edadUsuario >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }


        scanner.close();
    }
}


