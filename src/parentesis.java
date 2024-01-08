import java.util.Scanner;
import java.util.Stack;

public class parentesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        System.out.println("Introduce una cadena");
        String cadena = sc.nextLine();
        if (parentesis(stack, cadena)) {
            System.out.println("Bien parentizada");
        } else {
            System.out.println("Mal parentizada");
        }
    }
    public static boolean parentesis(Stack<Character> stack, String cadena) {
        char[] letras = cadena.toCharArray();
        for (Character letra:letras) {
            if (letra == '(' || letra == '{' || letra == '[') {
                stack.push(letra);
            } else if (letra == ')' || letra == '}' || letra == ']'){
                if (stack.isEmpty()) {
                    return false;
                }
                char ultima = stack.pop();
                if (ultima == '(' && letra != ')') {
                    return false;
                }
                if (ultima == '{' && letra != '}') {
                    return false;
                }
                if (ultima == '[' && letra != ']') {
                    return false;
                }
            }
        }
        return true;
    }
}