import java.util.Scanner;

public class Exercicio69 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;

        System.out.println("Digite 5 números inteiros:");

        for (int i = 0; i < 5; i++) {
            int numero = scanner.nextInt();
            soma += numero;
        }

        double media = (double) soma / 5;
        System.out.println("A média dos números é: " + media);

        scanner.close();
    }
}
