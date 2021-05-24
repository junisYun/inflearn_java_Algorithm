import java.util.Scanner;

public class Main {
    static int[] combi;
    static int N, M;
    static int answer = 0, result = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        combi = new int[M];
        dfs(0, 1);
    }

    public static void dfs(int L, int s) {
        if(L == M) {
            for(int x : combi) {
                System.out.print(x + " ");
            } System.out.println();
        } else {
            for(int i = s; i <= N; i++) {
                combi[L] = i;
                dfs(L + 1, i + 1);
            }
        }
    }
}
