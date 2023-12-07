import java.util.Scanner;

public class Exercicio42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int numero = scanner.nextInt();

        boolean ehPrimo = true;

        if (numero <= 1) {
            ehPrimo = false;
        } else {
            int i = 2;
            while (i <= Math.sqrt(numero)) {
                if (numero % i == 0) {
                    ehPrimo = false;
                    break;
                }
                i++;
            }
        }

        if (ehPrimo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }

        scanner.close();
    }
}
