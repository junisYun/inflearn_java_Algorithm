import java.util.Scanner;

public class Main {
    static int N, M;
    static int[][] graph;
    static int[] dis;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        dis = new int[N];
        for(int i = 0; i < N; i++) {
            dis[i] = Integer.MAX_VALUE;
        }
        graph = new int[N +1][N + 1];
        for(int i = 0; i < M; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int w = sc.nextInt();
            graph[x][y] = w;
        }

        for(int i = 0; i < N + 1; i++) {
            for(int j = 0; j < N + 1; j++) {
                System.out.print(graph[i][j] + " ");
            } System.out.println();
        }
    }
}
