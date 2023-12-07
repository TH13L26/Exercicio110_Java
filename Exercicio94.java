import java.util.Scanner;

public class Exercicio94 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 7 números inteiros:");

        for (int i = 0; i < 7; i++) {
            int num = scanner.nextInt();

            if (num % 2 == 0) {
                System.out.println(num);
            }
        }

        scanner.close();
    }
}
