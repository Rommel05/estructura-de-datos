import java.util.HashMap;

public class terminacion {
    public static void main(String[] args) {
        HashMap<Character, Integer> boletos = new HashMap<>();
        String boleto1 = "00004";
        char letra1 = boleto1.charAt(boleto1.length() - 1);
        boletos.put(letra1, 1);
        String boleto2 = "39804";
        char letra2 = boleto2.charAt(boleto2.length() - 1);
        Integer cuanto = boletos.get(letra1);
        if (letra1 == letra2){
            boletos.put(letra1, cuanto + 1);
        }
        String boleto3 = "03847";
        char letra3 = boleto3.charAt(boleto3.length() - 1);
        cuanto = boletos.get(letra3);
        if (cuanto == null) {
            boletos.put(letra3, 1);
        } else {
            boletos.put(letra3, cuanto + 1);
        }
        System.out.println(letra1 + " = " + boletos.get(letra1));
        System.out.println(letra3 + " = " + boletos.get(letra3));
    }
}
