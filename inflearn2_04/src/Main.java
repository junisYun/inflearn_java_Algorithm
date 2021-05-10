import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int x : solution(n)) {
            System.out.print(x + " ");
        }
    }

    public static int[] solution(int n) {
        int[] fib = new int[n];
        fib[0] = 1;
        fib[1] = 1;
        for(int i = 2; i < n; i++) {
            fib[i] = fib[i - 2] + fib[i - 1];
        }
        return fib;
    }
}
