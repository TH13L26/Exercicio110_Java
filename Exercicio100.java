import java.util.Scanner;

public class Exercicio100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        System.out.println("Digite os elementos da matriz 3x3:");


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }


        int maiorValor = encontrarMaiorValor(matriz);


        System.out.println("\nO maior valor presente na matriz é: " + maiorValor);

        scanner.close();
    }

    public static int encontrarMaiorValor(int[][] matriz) {
        int maior = matriz[0][0];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
        }

        return maior;
    }
}
