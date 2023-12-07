import java.util.Scanner;

public class Exercicio104 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        System.out.println("Digite os elementos da matriz 3x3:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        boolean simetrica = verificarSimetria(matriz);

        if (simetrica) {
            System.out.println("A matriz é simétrica.");
        } else {
            System.out.println("A matriz não é simétrica.");
        }

        scanner.close();
    }

    public static boolean verificarSimetria(int[][] matriz) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
