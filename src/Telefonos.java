import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Telefonos {
    public static void main(String[] args) {
        Map<String, String> mapa1 = new HashMap<>();
        mapa1.put("Emilio", "684706587");
        mapa1.put("Aurelio", "632111222");
        mapa1.put("Amancio", "655333444");
        mapa1.put("José", "600555666");
        mapa1.put("Pepe", "677777888");
        mapa1.put("Luis", "644999000");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un nombre");
        String nombre = sc.next();
        if (mapa1.containsKey(nombre)) {
            System.out.println("El número de ese contacto es: " + telf(mapa1,nombre));
        } else {
            System.out.println("No disponemos de la información de dicho contacto");
        }
    }
    public static String telf(Map<String, String> mapa1, String nombre) {
        return mapa1.get(nombre);
    }
}
