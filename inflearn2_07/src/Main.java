import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] score = new int[n];
        for(int i = 0; i < n; i++) {
            score[i] = sc.nextInt();
        }

        System.out.println(solution(n, score));

    }
    public static int solution(int n, int[] score) {
        int answer = 0;
        int plus = 1;
        for(int i = 0; i < n; i++) {
            if(score[i] == 1) {
                answer += plus;
                plus++;
            } else {
                plus = 1;
            }
        }
        return answer;
    }
}
