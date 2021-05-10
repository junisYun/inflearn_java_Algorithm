import java.util.Scanner;

public class Main {
    static int[][] graph;
    static boolean[] visited;
    static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        graph = new int[N + 1][N + 1];
        visited = new boolean[N + 1];
        int M = sc.nextInt();

        for(int i = 0; i < M; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            graph[x][y] = graph[y][x] = 1;
        }

        DFS(1);
    }
    public static void DFS(int x) {
        System.out.print(x + " ");
        visited[x] = true;

        for(int i = 1; i < N + 1; i++) {
            if(graph[x][i] == 1) {
                if(!visited[i]) {
                    DFS(i);
                }
            }
        }
    }
}
