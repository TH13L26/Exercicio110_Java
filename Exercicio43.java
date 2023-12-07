import java.util.Scanner;

public class Exercicio43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int numero = scanner.nextInt();

        int a = 0, b = 1, c;

        System.out.println("Sequência de Fibonacci até " + numero + ":");

        while (a <= numero) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }

        scanner.close();
    }
}
