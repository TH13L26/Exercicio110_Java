import java.util.Scanner;

public class Exercicio84 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadePares = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();
            if (numero % 2 == 0) {
                quantidadePares++;
            }
        }

        System.out.println("A quantidade de números pares é: " + quantidadePares);

        scanner.close();
    }
}
