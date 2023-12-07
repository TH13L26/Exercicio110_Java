import java.util.Scanner;

public class Exercicio41 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um número inteiro positivo:");
		int numero = scanner.nextInt();

		if (numero <= 0) {
			System.out.println("Por favor, digite um número inteiro positivo maior que zero.");
		} else {
			int i = 1;
			System.out.println("Divisores de " + numero + ":");

			while (i <= numero) {
				if (numero % i == 0) {
					System.out.println(i);
				}
				i++;
			}
		}

		scanner.close();
	}
}
