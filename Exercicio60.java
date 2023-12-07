public class Exercicio60 {
    public static void main(String[] args) {
        int contador = 0;
        int numeroAtual = 0;
        int proximoNumero = 1;

        System.out.println("Os primeiros 20 números da sequência de Fibonacci são:");

        do {
            System.out.print(numeroAtual + " ");

            int soma = numeroAtual + proximoNumero;
            numeroAtual = proximoNumero;
            proximoNumero = soma;

            contador++;
        } while (contador < 20);
    }
}

