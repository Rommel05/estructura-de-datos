import java.util.ArrayList;

public class LIstaEnOtraLista {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        ArrayList<Integer> numeros1 = new ArrayList<>();
        numeros1.add(7);
        numeros1.add(8);
        numeros1.addAll(numeros);
        for (int numero:numeros1) {
            System.out.println(numero);
        }
    }
}
