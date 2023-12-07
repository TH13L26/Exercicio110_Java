import java.util.Scanner;

public class Exercicio44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaIdades = 0;
        int contador = 0;

        while (contador < 5) {
            System.out.println("Digite o nome da pessoa " + (contador + 1) + ":");
            scanner.nextLine(); // Limpa o buffer antes de ler a linha
            String nome = scanner.nextLine();

            System.out.println("Digite a idade de " + nome + ":");
            int idade = scanner.nextInt();

            somaIdades += idade;
            contador++;
        }

        double mediaIdades = (double) somaIdades / 5;
        System.out.println("A média das idades é: " + mediaIdades);

        scanner.close();
    }
}
