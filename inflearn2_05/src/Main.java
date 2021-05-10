import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(solution(n));
    }
    public static int solution(int n) {
        // 이중 for문 -> 시간 오래 걸려서 비추천
/*        int answer = 0;
        for(int i = 2; i <= n; i++) {
            int cnt = 0;
            for(int j = 1; j <= i; j++) {
                if(i % j == 0) {
                    cnt++;
                }
            }
            if(cnt == 2) answer++;
        }
        return answer;*/

        // 에라토스테네스 체
        int[] isPrime = new int[n + 1];
        int cnt = 0;
        for(int i = 2; i < isPrime.length; i++) {
            if(isPrime[i] != 1) {
                cnt++;
                int j = i;
                while(j <= n) {
                    isPrime[j] = 1;
                    j = j + i;
                }
            }
        }
        return cnt;
    }
}
