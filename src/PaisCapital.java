import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PaisCapital {
    public static void main(String[] args) {
        Map<String, String> mapa1 = new HashMap<String, String>();
        mapa1.put("España", "Madrid");
        mapa1.put("Alemania", "Berlin");
        mapa1.put("Reino Unido", "Londres");
        mapa1.put("Paises Bajos", "Ámsterdam");
        mapa1.put("Polonia", "Varsovia");
        mapa1.put("Grecia", "Atenas");
        System.out.println("Introduce un país:");
        Scanner sc = new Scanner(System.in);
        String pe = sc.next();
        if (mapa1.containsKey(pe)) {
            System.out.println("La capital es: " + hay(mapa1, pe));
        } else {
            System.out.println("No disponemos de la información de ese país");
        }
        //System.out.println(mapa1.getOrDefault(pe, "No disponemos de la información de ese país"));
    }
    public static String hay(Map<String, String> mapa1, String pe) {
        return mapa1.get(pe);
    }
}

