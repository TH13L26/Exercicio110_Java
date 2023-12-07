import java.util.Scanner;

public class Exercicio63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();
        sc.close();

        System.out.println("Os dígitos do número " + numero + " são:");
        int temp = numero;
        do {
            int digito = temp % 10;
            System.out.println(digito);
            temp /= 10;
        } while (temp != 0);
    }
}
