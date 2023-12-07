import java.util.Scanner;

public class Exercicio98 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int somaDiagonalPrincipal = 0;

        System.out.println("Digite os elementos da matriz 3x3:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();

                if (i == j) {
                    somaDiagonalPrincipal += matriz[i][j];
                }
            }
        }

        System.out.println("\nMatriz inserida:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nA soma dos elementos da diagonal principal é: " + somaDiagonalPrincipal);

        scanner.close();
    }
}
