import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class coches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String coche;
        ArrayList<String> coches = new ArrayList<>();
        do {
            System.out.println("Introduce un coche:");
            coche = sc.nextLine();
            coches.add(coche);
        } while (!coche.isEmpty());
        Collections.sort(coches);
        for (String Coche:coches) {
            System.out.println(Coche);
        }
    }
}
