import java.util.Scanner;

public class Exercicio64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();
        sc.close();

        int fatorial = 1;
        int contador = 1;

        do {
            fatorial *= contador;
            contador++;
        } while (contador <= numero);

        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }
}
