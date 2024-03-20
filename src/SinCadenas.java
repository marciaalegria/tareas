import java.util.Locale;

public class SinCadenas {
    public static void main(String[]args){
        String cadena="Buenas tardes";
        String cuartaLetra= cadena.substring(3, 4);
        String quintaLetra= cadena.substring(4, 5);

        System.out.print("cuarta letra : " + cuartaLetra);
        System.out.print(" quinta letra : " + quintaLetra);
        int vocales= contarVocales(cadena);
        System.out.println(" La cadena " + cadena + " tiene " + vocales + " vocales");

    }
    public static int contarVocales( String cadena){
        int contadorVocales=0;
        cadena = cadena.toLowerCase();
        for (int i = 0; i < cadena.length(); i++) {
            char caracter= cadena.charAt(i);
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter =='o' || caracter == 'u'){
                contadorVocales++;
            }

        }
        return contadorVocales;

    }


}
