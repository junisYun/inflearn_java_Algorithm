import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] stdt = new int[n][5];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < 5; j++) {
                stdt[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution(n, stdt));
    }

    public static int solution(int n, int[][] stdt) {
        int answer = 0;
        int[][] cnt = new int[n][5];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < 5; j++) {
                int x = 1;
                for(int k = i + 1; k < n; k++) {
                    if(stdt[i][j] == stdt[i + x][j]) {
                        cnt[i + x][j] = 1;
                        cnt[i][j] = 1;
                        x++;
                    }
                }
            }
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(cnt[i][j] + " ");
            }
            System.out.println();
        }
        int[] chart = new int[n];
        for(int i = 0; i < n; i++) {
            int sum = 0;
            for(int j = 0; j < 5; j++) {
                sum += cnt[i][j];
            }
            chart[i] = sum;
        }
        for(int x : chart) {
            System.out.println(x);
        }



        return answer;
    }
}
