import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o peso (em kg):");
        double peso = scanner.nextDouble();

        System.out.println("Digite a altura (em metros):");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("O Índice de Massa Corporal (IMC) é: " + imc);

        scanner.close();
    }
}
