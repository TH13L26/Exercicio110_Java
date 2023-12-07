import java.util.Scanner;

public class Exercicio58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro para exibir a sequência de Fibonacci até esse número: ");
        int numero = scanner.nextInt();

        int primeiroNumero = 0, segundoNumero = 1;
        int proximoNumero;

        System.out.println("Sequência de Fibonacci até " + numero + ":");
        System.out.print(primeiroNumero + " ");

        do {
            System.out.print(segundoNumero + " ");
            proximoNumero = primeiroNumero + segundoNumero;
            primeiroNumero = segundoNumero;
            segundoNumero = proximoNumero;
        } while (segundoNumero <= numero);

        scanner.close();
    }
}
