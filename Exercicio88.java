import java.util.Scanner;

public class Exercicio88 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int somaPares = 0, somaImpares = 0;
        int qtdPares = 0, qtdImpares = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                somaPares += numero;
                qtdPares++;
            } else {
                somaImpares += numero;
                qtdImpares++;
            }
        }

        double mediaPares = qtdPares > 0 ? (double) somaPares / qtdPares : 0;
        double mediaImpares = qtdImpares > 0 ? (double) somaImpares / qtdImpares : 0;

        System.out.println("Média dos valores pares: " + mediaPares);
        System.out.println("Média dos valores ímpares: " + mediaImpares);

        scanner.close();
    }
}
