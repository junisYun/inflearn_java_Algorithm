import java.util.Scanner;

public class Main {
    static int N, C;
    static int[] weight;
    static int answer = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        C = sc.nextInt();
        N = sc.nextInt();
        weight = new int[N];
        for(int i = 0; i < N; i++) {
            weight[i] = sc.nextInt();
        }
        dfs(0, 0);
        System.out.println(answer);
    }
    public static void dfs(int L, int sum) {
        if(sum > C) return;
        if(L == N) {
            answer = Math.max(answer, sum);
        } else {
            dfs(L + 1, sum + weight[L]);
            dfs(L + 1, sum);
        }
    }
}
