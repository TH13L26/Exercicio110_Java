import java.util.Scanner;

public class Exercicio57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo para verificar se é primo: ");
        int numero = scanner.nextInt();

        boolean ehPrimo = true;

        int i = 2;
        do {
            if (numero % i == 0) {
                ehPrimo = false;
                break;
            }
            i++;
        } while (i <= numero / 2);

        if (ehPrimo && numero > 1) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }

        scanner.close();
    }
}
