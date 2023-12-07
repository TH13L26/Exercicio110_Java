import java.util.Scanner;

public class Exercicio97 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[2][2];
        int soma = 0;

        System.out.println("Digite os elementos da matriz 2x2:");

        // Loop para ler os elementos da matriz
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Digite o elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                soma += matriz[i][j]; // Adiciona o elemento à soma
            }
        }

        // Exibe a matriz inserida
        System.out.println("\nMatriz inserida:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Exibe a soma dos elementos da matriz
        System.out.println("\nA soma de todos os elementos da matriz é: " + soma);

        scanner.close();
    }
}
