import java.util.Scanner;

public class Exercicio96 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        System.out.println("Digite os elementos da matriz 3x3:");

        // Lendo os valores para a matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Digite o elemento [%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Exibindo a matriz
        System.out.println("Matriz digitada:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
