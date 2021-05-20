import java.util.Scanner;

public class Main {
    static int N, M;
    static int[] arr;
    static int[] pm, ch;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[N];
        pm = new int[M];
        ch = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        dfs(0);
    }
    public static void dfs(int L) {
        if(L == M) {
            for(int i = 0; i < M; i++) {
                System.out.print(pm[i] + " ");
            }
            System.out.println();
        } else {
            for(int i = 0; i < N; i++) {
                if(ch[i] != 1) {
                    ch[i] = 1;
                    pm[L] = arr[i];
                    dfs(L + 1);
                    ch[i] = 0;
                }
            }
        }
    }
}
