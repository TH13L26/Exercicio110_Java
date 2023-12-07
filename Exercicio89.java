import java.util.Scanner;

public class Exercicio89 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int qtdPositivos = 0, qtdNegativos = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();

            if (numero > 0) {
                qtdPositivos++;
            } else if (numero < 0) {
                qtdNegativos++;
            }
        }

        System.out.println("Quantidade de números positivos: " + qtdPositivos);
        System.out.println("Quantidade de números negativos: " + qtdNegativos);

        scanner.close();
    }
}
