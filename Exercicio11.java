import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite três números reais:");

        double numero1 = scanner.nextDouble();
        double numero2 = scanner.nextDouble();
        double numero3 = scanner.nextDouble();

        double media = (numero1 + numero2 + numero3) / 3;

        System.out.println("A média aritmética é: " + media);

        scanner.close();
    }
}