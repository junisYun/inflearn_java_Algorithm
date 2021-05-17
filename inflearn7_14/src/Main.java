import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int N, M;
    static int[][] graph;
    static int[] dis;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        graph = new int[N + 1][N + 1];
        dis = new int[N + 1];
        for(int i = 0; i < M; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            graph[x][y] = 1;
        }
        bfs(1);
        for(int i = 2; i <= N; i++) {
            System.out.println(i + "번 까지 거리 : " + dis[i] + " ");
        }
    }
    public static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        while(!q.isEmpty()) {
            int x = q.poll();
            for(int i = 1; i <= N; i++) {
                if(graph[x][i] == 1 && dis[i] == 0) {
                    q.offer(i);
                    dis[i] = dis[x] + 1;
                }
            }
        }
    }
}
