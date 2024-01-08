import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Telefonos2 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> mapa1 = new HashMap<>();
        ArrayList<String> numeros = new ArrayList<>();
        numeros.add("684706587");
        mapa1.put("Emilio", numeros);
        numeros = new ArrayList<>();
        numeros.add("632111222");
        numeros.add(" 611624870");
        mapa1.put("Aurelio", numeros);
        numeros = new ArrayList<>();
        numeros.add("655333444");
        mapa1.put("Amancio", numeros);
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un nombre");
        String nombre = sc.next();
        if (mapa1.containsKey(nombre)) {
            System.out.println(mapa1.get(nombre));
        } else {
            System.out.println("No tenemos esa información");
        }
    }
}

