import java.util.Scanner;

public class CheckFibonacci {

    public static boolean eFibonnaci (int numero) {
        int a = 0, b = 1;

        if (numero == a || numero == b) {
            return true;
        }

        int next = a + b;

        while (next <= numero) {
            if (next == numero) {
                return true;
            }
            a = b;
            b = next;
            next = a + b;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um numero para verificar se pertence a sequencia de Fibonacci: ");
        int numero = scanner.nextInt();

        if (eFibonnaci(numero)) {
            System.out.println("O numero " + numero + " pertence a sequencia de Fibonacci.");
        } else {
            System.out.println("O numero " + numero + " não pertence a sequencia de Fibonacci.");
        }

        scanner.close();
    }
}
