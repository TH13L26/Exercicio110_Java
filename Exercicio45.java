public class Exercicio45 {
    public static void main(String[] args) {
        int a = 0, b = 1, c;
        int contador = 0;

        System.out.println("Os primeiros 20 números da sequência de Fibonacci:");

        while (contador < 20) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
            contador++;
        }
    }
}
