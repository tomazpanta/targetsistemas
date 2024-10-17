import java.util.Scanner;

public class VerificandoString {

    public static int contadorDeA(String texto) {
        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            if (letra == 'a' || letra == 'A') {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe uma frase: ");
        String texto = scanner.nextLine();

        int letrasA = contadorDeA(texto);

        if (letrasA > 0) {
            System.out.println("A letra 'a' aparece " + letrasA + " vezes na frase.");
        } else {
            System.out.println("A letra 'a' não aparece na frase.");
        }

        scanner.close();
    }
}
