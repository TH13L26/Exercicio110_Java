import java.util.Scanner;

public class Exercicio102 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];
        int[][] produtoMatrizes = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matriz1[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matriz2[i][j] = scanner.nextInt();
            }
        }

        produtoMatrizes[0][0] = matriz1[0][0] * matriz2[0][0] + matriz1[0][1] * matriz2[1][0];
        produtoMatrizes[0][1] = matriz1[0][0] * matriz2[0][1] + matriz1[0][1] * matriz2[1][1];
        produtoMatrizes[1][0] = matriz1[1][0] * matriz2[0][0] + matriz1[1][1] * matriz2[1][0];
        produtoMatrizes[1][1] = matriz1[1][0] * matriz2[0][1] + matriz1[1][1] * matriz2[1][1];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(produtoMatrizes[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
