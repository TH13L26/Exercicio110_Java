import java.util.Scanner;

public class Exercicio91 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaPositivos = 0;
        int somaNegativos = 0;

        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();

            if (num > 0) {
                somaPositivos += num;
            } else {
                somaNegativos += num;
            }
        }

        System.out.println("Soma dos valores positivos: " + somaPositivos);
        System.out.println("Soma dos valores negativos: " + somaNegativos);

        scanner.close();
    }
}
