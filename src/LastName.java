import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class LastName {
    public static void main(String[] args) throws IOException {
        String filepath = new File("").getAbsolutePath();
        filepath = filepath.concat("/src/LastnameFrequencies.csv");
        BufferedReader reader = new BufferedReader(new FileReader(filepath));
        String datos, Napellidos, apellidos, numeros;
        Integer numero = 0;
        String[] tabla;
        Map<String, Integer> paises = new HashMap<>();
        reader.readLine();
        while ((datos = reader.readLine()) != null) {
            tabla = datos.split(",");
            Napellidos = tabla[1];
            Napellidos.replaceAll("\\.","");

            if (numero == null) {
                paises.put(Napellidos, 1);
            } else {
                paises.put(Napellidos,numero + 1);
            }
        }
        if (paises.isEmpty()) {
            System.out.println("El fichero está vacio");
        }
        reader.close();
    }
}
