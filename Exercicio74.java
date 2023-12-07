package logica_programacao;
import java.util.Scanner;

public class Exercicio74 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaIdades = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o nome da pessoa " + (i + 1) + ":");
            scanner.nextLine();
            String nome = scanner.nextLine();

            System.out.println("Digite a idade de " + nome + ":");
            int idade = scanner.nextInt();

            somaIdades += idade;
        }

        double mediaIdades = (double) somaIdades / 5;
        System.out.println("A média das idades é: " + mediaIdades);

        scanner.close();
    }
}
