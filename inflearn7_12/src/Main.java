import java.util.Scanner;

public class Main {
    static int[][] graph;
    static boolean[] visited;
    static int V, E;
    static int answer = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        V = sc.nextInt();
        E = sc.nextInt();
        graph = new int[V + 1][V + 1];
        visited = new boolean[V + 1];
        for(int i = 0; i < E; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            graph[x][y] = 1;
        }
        visited[1] = true;
        DFS(1);
        System.out.println(answer);
    }
    public static void DFS(int start) {
        if(start == V) {
            answer++;
        } else {
            for (int i = 1; i <= V; i++) {
                if(graph[start][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    DFS(i);
                    visited[i] = false;
                }
            }
        }
    }
}
