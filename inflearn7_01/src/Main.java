import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        solution(N);
    }

    public static void solution(int N) {
        if(N == 0) return;
        System.out.println(N);
        solution(N - 1);
    }
}
