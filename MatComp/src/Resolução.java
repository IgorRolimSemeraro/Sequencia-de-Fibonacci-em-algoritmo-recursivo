import java.util.Scanner;

public class Resolução {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Sequência de Fibonacci");
        System.out.println("Digite o numero da sequencia que quer descobrir:");
        int n = ler.nextInt();

        long[] memoria = new long[n + 1];

        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i, memoria) + " ");
        }
    }

    public static long fibonacci(int n, long[] memoria) {
        if (n <= 1) {
            return n;
        } else if (memoria[n] != 0) {
            return memoria[n];
        } else {
            memoria[n] = fibonacci(n - 1, memoria) + fibonacci(n - 2, memoria);
        }
        return memoria[n];
    }
}

