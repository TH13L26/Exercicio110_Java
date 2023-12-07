import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade em anos:");
        int anos = scanner.nextInt();

        System.out.println("Digite a idade em meses:");
        int meses = scanner.nextInt();

        System.out.println("Digite a idade em dias:");
        int dias = scanner.nextInt();

        int diasDeVida = (anos * 365) + (meses * 30) + dias;

        System.out.println("Você tem aproximadamente " + diasDeVida + " dias de vida.");

        scanner.close();
    }
}

