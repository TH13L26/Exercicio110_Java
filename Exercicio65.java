import java.util.Scanner;

public class Exercicio65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int somaIdades = 0;
        int contador = 0;
        String nome;

        do {
            System.out.print("Digite o nome da pessoa ou 'fim' para encerrar: ");
            nome = sc.nextLine();

            if (!nome.equalsIgnoreCase("fim")) {
                System.out.print("Digite a idade de " + nome + ": ");
                int idade = sc.nextInt();
                sc.nextLine(); // Consumir a quebra de linha

                somaIdades += idade;
                contador++;
            }
        } while (!nome.equalsIgnoreCase("fim"));

        sc.close();

        if (contador > 0) {
            double media = (double) somaIdades / contador;
            System.out.println("A média das idades é: " + media);
        } else {
            System.out.println("Nenhuma idade foi inserida.");
        }
    }
}
