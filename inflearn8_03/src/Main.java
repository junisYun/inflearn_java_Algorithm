import java.util.Scanner;

class PROB {
    int score;
    int limit;
    public PROB(int score, int limit) {
        this.score = score;
        this.limit = limit;
    }
}
public class Main {
    static int N, M;
    static PROB[] list;
    static int answer = Integer.MIN_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        list = new PROB[N];
        for(int i = 0; i < N; i++) {
            int score = sc.nextInt();
            int limit = sc.nextInt();
            list[i] = new PROB(score, limit);
        }
        dfs(0, 0, 0);
        System.out.println(answer);
    }
    public static void dfs(int L, int score, int limit) {
        if(limit > M) return;
        if(L == N) {
            answer = Math.max(answer, score);
        } else {
            dfs(L + 1, score + list[L].score, limit + list[L].limit);
            dfs(L + 1, score, limit);
        }
    }
}
