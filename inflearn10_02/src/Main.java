import java.util.Scanner;

public class Main {
    static int[] dy;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        dy = new int[N + 2];
        System.out.println(solution(N));
    }
    public static int solution(int N) {
        dy[1] = 1;
        dy[2] = 2;
        for(int i = 3; i <= N + 1; i++) {
            dy[i] = dy[i - 1] + dy[i - 2];
        }
        return dy[N + 1];
    }
}
