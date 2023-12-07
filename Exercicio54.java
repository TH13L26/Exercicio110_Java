import java.util.Scanner;

public class Exercicio54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int contador = 0;

        do {
            System.out.println("Digite um número inteiro:");
            int numero = scanner.nextInt();
            soma += numero;
            contador++;
        } while (contador < 5);

        double media = (double) soma / 5;
        System.out.println("A média dos números é: " + media);

        scanner.close();
    }
}
