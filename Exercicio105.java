import java.util.Scanner;

public class Exercicio105 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[4][4];

        System.out.println("Digite os elementos da matriz 4x4:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        int[] somaColunas = new int[4];
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                somaColunas[j] += matriz[i][j];
            }
        }

        for (int j = 0; j < 4; j++) {
            System.out.println("Soma da coluna " + (j + 1) + ": " + somaColunas[j]);
        }

        scanner.close();
    }
}
