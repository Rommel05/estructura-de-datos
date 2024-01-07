import java.util.ArrayList;
import java.util.Scanner;

public class Alturas {
    public static void main(String[] args) {
        int numAlu = numAlu();
        ArrayList<Double> alturas = new ArrayList<>();
        alturas = altura(alturas, numAlu);
        double media = CalcularMedia(alturas);
        mostrarResultados(alturas, media);
    }
    public static int numAlu() {
        System.out.println("Introduce el número de alumnos:");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    public static ArrayList<Double> altura(ArrayList<Double> alturas, int numAlu) {
        System.out.println("Introduce las alturas de los alumnos:");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numAlu; i++) {
            alturas.add(sc.nextDouble());
        }
        return alturas;
    }
    public static Double CalcularMedia(ArrayList<Double> alturas) {
        double totalAlturas = 0;
        for (Double alturaa:alturas) {
            totalAlturas += alturaa;
        }
        return totalAlturas / alturas.size();
    }
    public static int calcularAlumnosAlturaSuperior(ArrayList<Double> alturas, double media) {
        int contadorAltos = 0;
        for (Double altura:alturas) {
            if (media < altura) {
                contadorAltos++;
            }
        }
        return contadorAltos;
    }
    public static int calcularAlumnosAlturaInferior(ArrayList<Double> alturas, double media) {
        int contadorBajos = 0;
        for (Double altura:alturas) {
            if (media > altura) {
                contadorBajos++;
            }
        }
        return contadorBajos;
    }
    public static void mostrarResultados(ArrayList<Double> alturas, double media) {
        for (Double altura:alturas) {
            System.out.println(altura);
        }
        System.out.println("La media es: " + media);
        System.out.println("Alumnos más altos que la media: " + calcularAlumnosAlturaSuperior(alturas, media));
        System.out.println("Alumnos más bajos que la media: " + calcularAlumnosAlturaInferior(alturas, media));
    }
}
