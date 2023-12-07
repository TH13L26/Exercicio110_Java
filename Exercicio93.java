import java.util.Scanner;

public class Exercicio93 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;

        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();

            if (num >= 10 && num <= 50) {
                count++;
            }
        }

        System.out.println("Quantidade de números no intervalo de 10 a 50: " + count);

        scanner.close();
    }
}
