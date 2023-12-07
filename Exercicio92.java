import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio92 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer[] numeros = new Integer[5];

        for (int i = 0; i < 5; i++) {
            numeros[i] = scanner.nextInt();
        }

        Arrays.sort(numeros, Collections.reverseOrder());

        System.out.println("Números em ordem decrescente:");
        for (int num : numeros) {
            System.out.println(num);
        }

        scanner.close();
    }
}
