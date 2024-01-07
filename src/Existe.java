import java.util.ArrayList;
import java.util.Scanner;

public class Existe {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        if (existe(numeros)) {
            System.out.println("Si está contenido");
        } else {
            System.out.println("No está contenido");
        }
    }
    public static boolean existe(ArrayList<Integer> numeros) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int numero = sc.nextInt();
        if (numeros.contains(numero)) {
            return true;
        } else {
            return false;
        }
    }
}
