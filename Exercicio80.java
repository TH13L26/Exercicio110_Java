import java.util.Scanner;

public class Exercicio80 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaIdades = 0;
        int quantidadePessoas = 0;

        while (true) {
            System.out.print("Digite o nome da pessoa (ou 'fim' para encerrar): ");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.print("Digite a idade de " + nome + ": ");
            int idade = scanner.nextInt();
            scanner.nextLine();

            somaIdades += idade;
            quantidadePessoas++;
        }

        if (quantidadePessoas > 0) {
            double mediaIdades = (double) somaIdades / quantidadePessoas;
            System.out.println("A média das idades é: " + mediaIdades);
        } else {
            System.out.println("Nenhuma idade foi inserida.");
        }

        scanner.close();
    }
}
