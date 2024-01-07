import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> mapa1 = new HashMap<>();
        System.out.println("Introduce una serie de palabras, deja un espacio en blanco para finalizar:");
        String cadena;
        while (true) {
            cadena = sc.nextLine();
            if (cadena.isEmpty()) {
                break;
            }
            String[] divPal = cadena.split(" ");
            for (String pal:divPal) {
                if (mapa1.containsKey(pal)) {
                    mapa1.put(pal, mapa1.get(pal) + 1);
                } else {
                    mapa1.put(pal, 1);
                }
            }
        }
        System.out.println(mapa1);
    }
}