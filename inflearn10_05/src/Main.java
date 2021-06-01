import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static int n, m, answer = Integer.MAX_VALUE;
    static Integer[] coin;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        coin = new Integer[n];
        for(int i = 0; i < n; i++) {
            coin[i] = sc.nextInt();
        }
        m = sc.nextInt();
        Arrays.sort(coin, Collections.reverseOrder());
        dfs(0, 0);
        System.out.println(answer);
    }
    public static void dfs(int L, int sum) {
        if(sum > m || L >= answer) {
            return;
        }
        if(sum == m) {
            answer = L;
        }
        else {
            for(int i = 0; i < n; i++) {
                dfs(L + 1, sum + coin[i]);
            }
        }
    }
}
