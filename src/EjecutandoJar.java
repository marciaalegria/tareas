import java.util.Scanner;
public class EjecutandoJar {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingresa tu nombre, edad y ocupación");
        //leer nombre usuario
        System.out.print("Nombre : ");
        String nombre= scanner.nextLine();
        //leer edad de usuario
        System.out.print("Edad : ");
        int edad= scanner.nextInt();
        scanner.nextLine();
        //leer ocupacion d e usuario
        System.out.print("Ocupación : ");
        String ocupacion= scanner.nextLine();
        //saludo a usuario
        System.out.println("hola "+ nombre + "tienes " + edad + "años, y tu ocupación es " + ocupacion);
    }
}
