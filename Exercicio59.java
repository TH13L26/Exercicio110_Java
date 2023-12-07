import java.util.Scanner;

public class Exercicio59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int somaIdades = 0;

        do {
            System.out.print("Digite o nome da pessoa: ");
            String nome = scanner.nextLine();

            System.out.print("Digite a idade de " + nome + ": ");
            int idade = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer de entrada

            somaIdades += idade;
            contador++;
        } while (contador < 5);

        if (contador > 0) {
            double mediaIdades = (double) somaIdades / contador;
            System.out.println("A média das idades é: " + mediaIdades);
        } else {
            System.out.println("Nenhuma idade foi inserida.");
        }

        scanner.close();
    }
}
