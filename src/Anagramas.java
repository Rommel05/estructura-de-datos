import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagramas {
    public static String alfabetizada(String line){
        char[] letras = line.toCharArray();
        Arrays.sort(letras);
        return new String(letras);
    }
    public static Map<String, String> Anagrama(String alfabetizada,  String line, Map<String, String> palabras) {
        if (palabras.containsKey(alfabetizada)) {
            String actual = palabras.get(alfabetizada) + " " + line;
            palabras.replace(alfabetizada, actual);
        }else {
            palabras.put(alfabetizada, line);
        }
        return palabras;
    }
    public static void main(String[] args) throws IOException {
        String filepath = new File("").getAbsolutePath();
        BufferedReader reader = new BufferedReader(new FileReader(filepath.concat("/src/spanish-dict.txt")));
        String line;
        Map<String, String> palabras = new HashMap<>();
        while ((line = reader.readLine())!=null) {
            palabras = Anagrama(alfabetizada(line), line, palabras);
        }
        for  (String palabra : palabras.keySet()) {
            String[] actual = palabras.get(palabra).split(" ");
            if (actual.length > 2) {
                System.out.println(palabra + "= " + palabras.get(palabra));
            }
        }
        reader.close();
    }
}
