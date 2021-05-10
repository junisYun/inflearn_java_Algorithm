import java.util.Scanner;

public class Main {
    static int[] fibo;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        fibo = new int[N + 1];

        solution(N);
            System.out.print(fibo[N] + " ");

    }
    public static int solution(int N) {
        if(fibo[N] > 0) return fibo[N];
        if(N == 1) return fibo[N] = 1;
        else if(N == 2) return fibo[N] = 1;
        else {
            return fibo[N] = solution(N - 1) + solution(N - 2);
        }
    }
}
