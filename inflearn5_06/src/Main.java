import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        System.out.println(solution(N, K));
    }
    public static int solution(int N, int K) {
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1; i <= N; i++) {
            q.offer(i);
        }

        while(q.size() != 1) {
            for (int i = 0; i < K - 1; i++) {
                q.offer(q.poll());
            }
            q.poll();
        }
        return q.poll();
    }
}
