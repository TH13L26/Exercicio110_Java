import java.util.Scanner;

public class Exercicio61 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int soma = 0;
        int contador = 1;

        do {
            if (contador % 2 == 0) {
                soma += contador;
            }
            contador++;
        } while (contador <= numero);

        System.out.println("A soma dos números pares entre 1 e " + numero + " é: " + soma);

        scanner.close();
    }
}
