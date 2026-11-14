import java.util.Scanner;

public class Recursivo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Sequência de Fibonacci");
        System.out.println("Digite o numero da sequencia que quer descobrir:");
        int n = ler.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}