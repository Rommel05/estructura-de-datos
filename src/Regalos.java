import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Regalos {
    public static void main(String[] args) {
        ArrayList<Integer> portales = new ArrayList<>(Arrays.asList(2, 5, 1));
        System.out.println(repartir(3, portales));
        int desde;
        int aterriza;
    }
    public static int siguiente (ArrayList<Integer> portales, int desde) {
        int diff, min = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < portales.size(); i++) {
            diff = Math.abs(portales.get(i) - desde);
            if (diff <= min){
                min = diff;
                index = i;
            }
        }
        return portales.get(index);
    }
    public static String repartir(int aterriza, ArrayList<Integer> portales) {
        String result = "";
        int actual = aterriza;
        Collections.sort(portales);
        while (!portales.isEmpty()) {
            actual = siguiente(portales, actual);
            result += actual + " ";
            portales.remove(Integer.valueOf(actual));
        }
        return result;
    }
}
