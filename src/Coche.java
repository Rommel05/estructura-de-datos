import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Coche {
    public static void main(String[] args) {
        ArrayList<String> coches = new ArrayList<>();
        for(String coche:cochess(coches)) {
            System.out.println(coche);
        }
    }
    public static ArrayList<String> cochess(ArrayList<String> coches) {
        Scanner sc = new Scanner(System.in);
        String coche;
        do {
            System.out.println("Introduce un coche");
            coche = sc.nextLine();
            coches.add(coche);
        } while (!coche.isEmpty());
        Collections.sort(coches);
        return coches;
    }
}
