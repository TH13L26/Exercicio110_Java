import java.util.Scanner;

public class Exercicio50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaIdades = 0;
        int contador = 0;

        String nome = "";

        while (!nome.equalsIgnoreCase("fim")) {
            System.out.print("Digite o nome da pessoa ou 'fim' para encerrar: ");
            nome = scanner.nextLine();

            if (!nome.equalsIgnoreCase("fim")) {
                System.out.print("Digite a idade de " + nome + ": ");
                int idade = scanner.nextInt();

                scanner.nextLine(); // Limpar o buffer

                somaIdades += idade;
                contador++;
            }
        }

        if (contador > 0) {
            double media = (double) somaIdades / contador;
            System.out.println("A média das idades é: " + media);
        } else {
            System.out.println("Nenhuma idade foi inserida.");
        }

        scanner.close();
    }
}
