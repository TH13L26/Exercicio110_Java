import java.util.Scanner;

public class Exercicio106 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];

        System.out.println("Digite os elementos da primeira matriz 2x2:");
        lerMatriz(scanner, matriz1);

        System.out.println("Digite os elementos da segunda matriz 2x2:");
        lerMatriz(scanner, matriz2);

        boolean saoIguais = verificarIgualdadeMatrizes(matriz1, matriz2);

        if (saoIguais) {
            System.out.println("As matrizes são iguais.");
        } else {
            System.out.println("As matrizes são diferentes.");
        }

        scanner.close();
    }

    public static void lerMatriz(Scanner scanner, int[][] matriz) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    public static boolean verificarIgualdadeMatrizes(int[][] matriz1, int[][] matriz2) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (matriz1[i][j] != matriz2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
