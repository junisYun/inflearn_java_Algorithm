import java.util.Scanner;

public class Main {
    static String answer = "NO";
    static int N, total = 0;
    static int[] array;
    static boolean flag = false;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        array = new int[N];
        for(int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
            total += array[i];
        }
        dfs(0, 0);
        System.out.println(answer);

    }
    public static void dfs(int L, int sum) {
        if(flag) return;
        if(L == N) {
            if(total - sum == sum) {
                answer = "YES";
                flag = true;
            }
        } else {
            dfs(L + 1, sum + array[L]);
            dfs(L + 1, sum);
        }
    }
}
