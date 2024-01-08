import java.util.Stack;

public class ExpresionesAritmeticas {
    public static void main(String[] args) {
        String cadena = "5 1 2 + 4 * + 3 -";
        System.out.println(stack(cadena));
    }
    public static Stack<Integer> stack(String cadena) {
        String[] datos = cadena.split(" ");
        Stack<Integer> stack = new Stack<>();
        int n1;
        int n2;
        int resultado;
        for (String dato:datos) {
            switch (dato) {
                case "+":
                    n2 = stack.pop();
                    n1 = stack.pop();
                    resultado = n1 + n2;
                    stack.push(resultado);
                    break;
                case "-":
                    n2 = stack.pop();
                    n1 = stack.pop();
                    resultado = n1 - n2;
                    stack.push(resultado);
                    break;
                case "*":
                    n2 = stack.pop();
                    n1 = stack.pop();
                    resultado = n1 * n2;
                    stack.push(resultado);
                    break;
                case "/":
                    n2 = stack.pop();
                    n1 = stack.pop();
                    resultado = n1 / n2;
                    stack.push(resultado);
                    break;
                default:
                    stack.push(Integer.parseInt(dato));
                    break;
            }
        }
        return stack;
    }
}