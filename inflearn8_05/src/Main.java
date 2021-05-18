import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static int amount, N;
    static Integer[] coin;
    static int answer = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        coin = new Integer[N];
        for(int i = 0; i < N; i++) {
            coin[i] = sc.nextInt();
        }
        Arrays.sort(coin, Collections.reverseOrder());
        amount = sc.nextInt();
        dfs(0, 0);
        System.out.println(answer);
    }
    public static void dfs(int L, int sum) {
        if(sum > amount || L >= answer) return;
        if(sum == amount) {
            answer = Math.min(answer, L);
        } else {
            for(int i = 0; i < N; i++) {
                if(L + 1 < answer) {
                    dfs(L + 1, sum + coin[i]);
                }
            }
        }
    }
}
