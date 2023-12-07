import java.util.Scanner;

public class Exercicio109 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        System.out.println("Digite os elementos da matriz 3x3:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        boolean ehMatrizIdentidade = verificarMatrizIdentidade(matriz);

        if (ehMatrizIdentidade) {
            System.out.println("É uma matriz identidade.");
        } else {
            System.out.println("Não é uma matriz identidade.");
        }

        scanner.close();
    }

    public static boolean verificarMatrizIdentidade(int[][] matriz) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i != j && matriz[i][j] != 0) {
                    return false;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            if (matriz[i][i] != 1) {
                return false;
            }
        }

        return true;
    }
}
