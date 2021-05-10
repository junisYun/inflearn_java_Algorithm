import java.util.Scanner;

public class Main {
    static int n;
    static int[] check;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        check = new int[n + 1];
        solution(1);
    }

    public static void solution(int L) {
        if(L == n + 1) {
            String tmp = "";
            for(int i = 1; i <= n; i++) {
                if(check[i] == 1) {
                    tmp += (i + " ");
                }
            }
            if(tmp.length() > 0) System.out.println(tmp);

        } else {
            check[L] = 1;
            solution(L + 1);
            check[L] = 0;
            solution(L + 1);
        }
    }
}
