import java.util.Scanner;

public class Main {
    static int N, M;
    static int[] arr, check, pm;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        check = new int[N];
        pm = new int[M];
        dfs(0);
    }
    public static void dfs(int L) {
        if(L == M) {
            for(int x : pm) {
                System.out.print(x + " ");
            } System.out.println();
        } else {
            for(int i = 0; i < N; i++) {
                if(check[i] == 0) {
                    check[i] = 1;
                    pm[L] = arr[i];
                    dfs(L + 1);
                    check[i] = 0;
                }
            }
        }
    }
}
