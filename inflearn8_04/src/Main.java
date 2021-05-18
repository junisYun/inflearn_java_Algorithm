import java.util.Scanner;

public class Main {
    static int N, M;
    static int[] pm;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        pm = new int[M];
        dfs(0);
    }
    public static void dfs(int L) {
        if(L == M) {
            for(int x : pm) System.out.print(x + " ");
            System.out.println();
        } else {
            for(int i = 1; i <= N; i++) {
                pm[L] = i;
                dfs(L + 1);
            }
        }
    }
}
