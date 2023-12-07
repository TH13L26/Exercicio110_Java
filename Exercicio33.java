import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno:");
        String nome = scanner.nextLine();

        System.out.println("Digite o turno (M - Matutino / V - Vespertino):");
        char turno = scanner.next().charAt(0);

        String saudacao;

        if (turno == 'M') {
            saudacao = "Bom dia, " + nome + "!";
        } else if (turno == 'V') {
            saudacao = "Boa tarde, " + nome + "!";
        } else {
            saudacao = "Turno inválido!";
        }

        System.out.println(saudacao);

        scanner.close();
    }
}
