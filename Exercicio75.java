public class Exercicio75 {
    public static void main(String[] args) {
        int a = 0, b = 1, c;

        System.out.println("Os primeiros 20 números da sequência de Fibonacci:");

        for (int i = 0; i < 20; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
