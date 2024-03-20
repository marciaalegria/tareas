import java.util.Scanner;
public class Arreglando {
    public static void main(String[] args){

        int[] arregloHechoPorUsuario= new int[3];
        Scanner scanner= new Scanner(System.in);

        for (int i=0; i<arregloHechoPorUsuario.length; i++){
            System.out.print("Ingrese número para arreglo " + (i+1) + ": ");
            arregloHechoPorUsuario[i]= scanner.nextInt();
        }
        int mayor= arregloHechoPorUsuario[0];
        for (int i = 1; i < arregloHechoPorUsuario.length; i++) {
            if (arregloHechoPorUsuario[i] > mayor){
                mayor= arregloHechoPorUsuario[i];
            }
        }
        System.out.println("El numero mayor ingresado es "+ mayor);

    }
}
