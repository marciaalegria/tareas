import java.util.Scanner;
public class CondicionalSwitch {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        //pedir a usuario mes
        System.out.print("ingrese un n{umero de mes (1 - 12) ");
        int mes = scanner.nextInt();

        //declarar variables nombre mes y estacion
        String nombreMes;
        String estacion;

        switch (mes){
            case 1:
                nombreMes="Enero";
                estacion="Verano";
                break;
            case 2:
                nombreMes="Febrero";
                estacion="Verano";
                break;
            case 3:
                nombreMes="Marzo";
                estacion="Verano";
                break;
            case 4:
                nombreMes="Abril";
                estacion="Otoño";
                break;
            case 5:
                nombreMes="Mayo";
                estacion="Otoño";
                break;
            case 6:
                nombreMes="Junio";
                estacion="Otoño";
                break;
            case 7:
                nombreMes="Julio";
                estacion="Invierno";
                break;
            case 8:
                nombreMes="Agosto";
                estacion="Invierno";
                break;
            case 9:
                nombreMes="Septiembre";
                estacion="Invierno";
                break;
            case 10:
                nombreMes="Octubre";
                estacion="Primavera";
                break;
            case 11:
                nombreMes="Noviembre";
                estacion="Primavera";
                break;
            case 12:
                nombreMes="Diciembre";
                estacion="Primavera";
                break;
            default:
                nombreMes="Mes no valido";
                estacion="Estaci{on no v{alida";
                break;
        }
        System.out.println("El mes ingresado es "+ nombreMes + " y corresponde a la estación " + estacion);
        scanner.close();
    }
}
