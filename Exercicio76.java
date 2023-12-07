import java.util.Scanner;

public class Exercicio76 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int numero = scanner.nextInt();

        int soma = 0;

        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 0) { // Verifica se o número é par
                soma += i; // Adiciona o número par à soma
            }
        }

        System.out.println("A soma dos números pares até " + numero + " é: " + soma);

        scanner.close();
    }
}
