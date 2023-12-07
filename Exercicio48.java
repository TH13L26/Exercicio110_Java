import java.util.Scanner;

public class Exercicio48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        System.out.println("Dígitos do número separados:");

        while(numero > 0) {
            int digito = numero % 10;
            System.out.println(digito);
            numero = numero / 10;
        }

        scanner.close();
    }
}
