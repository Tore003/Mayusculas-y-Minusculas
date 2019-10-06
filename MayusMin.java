import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MayusMin {

    public static void main(String[] args) throws IOException {
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        String nombre;
        int contadorMinusculas = 0;
        int contadorMayusculas = 0;
        System.out.println("Ingrese su nombre");
        nombre = bufEntrada.readLine();

        for (int i = 0; i < nombre.length(); i++) {
            if (Character.isUpperCase(nombre.charAt(i))) {
                contadorMayusculas++;
            } else if (Character.isLowerCase(nombre.charAt(i))) {
                contadorMinusculas++;
            }
        }
        System.out.println("Su nombre es: " + nombre);
        System.out.println("Total de mayusculas: " + contadorMayusculas);
        System.out.println("Total de minusculas: " + contadorMinusculas);
    }
}
