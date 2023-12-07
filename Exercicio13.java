import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro:");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número inteiro:");
        int numero2 = scanner.nextInt();

        if (numero2 != 0 && numero1 % numero2 == 0) {
            System.out.println(numero1 + " é múltiplo de " + numero2);
        } else {
            System.out.println(numero1 + " não é múltiplo de " + numero2);
        }

        scanner.close();
    }
}
