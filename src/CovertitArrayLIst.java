import java.util.ArrayList;

public class CovertitArrayLIst {
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Piña");
        frutas.add("Pera");
        frutas.add("Sandia");
        String[] array = new String[frutas.size()];
        for (int i = 0; i < frutas.size(); i++) {
            array[i] = frutas.get(i);
        }
        for (String fruta:array) {
            System.out.println(fruta);
        }
    }
}
