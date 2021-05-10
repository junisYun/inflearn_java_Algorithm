import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(n, arr));
    }
    public static int solution(int n, int[][] arr) {
        int max1 = 0, max2 = 0, sum3 = 0, sum4 = 0;

        for(int i = 0; i < n; i++) {
            int sum1 = 0;
            int sum2 = 0;
            for(int j = 0; j < n; j++) {
                if(i == j) {
                    sum3 += arr[i][j];
                }
                if(i + j == 4) {
                    sum4 += arr[i][j];
                }
                sum2 += arr[j][i];
                sum1 += arr[i][j];
            }
            max1 = Math.max(max1, Math.max(sum1, sum2));
            max2 = Math.max(sum3, sum4);
        }
        return Math.max(max1, max2);
    }
}
