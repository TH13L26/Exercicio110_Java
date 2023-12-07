import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o salário atual do funcionário:");
        double salarioAtual = scanner.nextDouble();

        // Calcula o aumento de 15%
        double aumento = salarioAtual * 0.15;
        double novoSalario = salarioAtual + aumento;

        System.out.println("O novo salário com o aumento é: " + novoSalario);

        scanner.close();
    }
}
