import java.util.Scanner;

public class Main {
    static int[][] arr = new int[50][50];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(dfs(n, r));
    }

    public static int dfs(int n, int r) {
        if(n == r || r == 0) {
            return 1;
        } else if(arr[n][r] != 0) {
            return arr[n][r];
        } else{
            return arr[n][r] = dfs(n - 1, r - 1) + dfs(n - 1, r);
        }
    }
}
