import java.util.Scanner;
public class MathAlgo {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese numero entero");
        int entero = scanner.nextInt();
        int doble= entero * 2;
        int triple= entero * 3;
        double raizCuadrada= Math.sqrt(entero);
        double potenciasiete= Math.pow(entero , 7);

        System.out.print("numero ingresado  " + entero + "el doble es " + doble + " El triple es "
                + triple+ "su raiz cuadrada " + raizCuadrada + "y su potencia a siete : " + potenciasiete);

    }
}
