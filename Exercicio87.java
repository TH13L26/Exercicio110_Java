import java.util.Scanner;

public class Exercicio87 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerosPositivos = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();

            if (numero > 0) {
                numerosPositivos++;
            }
        }

        System.out.println("Quantidade de números positivos: " + numerosPositivos);

        scanner.close();
    }
}
