import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] sales = new int[n];
        for(int i = 0; i < n; i++) {
            sales[i] = sc.nextInt();
        }

        System.out.println(solution(n, sales, k));
    }
    public static int solution(int n, int[] sales, int k) {
        int answer = 0;
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += sales[i];
        }
        answer = sum;
        for(int i = k; i < n; i++) {
            sum += (sales[i] - sales[i - k]);
            answer = Math.max(answer, sum);
        }
        return answer;
    }
}
