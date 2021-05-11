import java.util.Scanner;

public class Main {
    static int[][] graph;
    static boolean[] visited;
    static int distance = 0;
    static int end = 5;
    static int V,E;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        V = sc.nextInt();
        E = sc.nextInt();
        graph = new int[V + 1][V + 1];
        visited = new boolean[V + 1];
        for(int i = 0; i < E; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            graph[x][y] = graph[y][x] = 1;
        }
        System.out.println(DFS(1));
    }
    public static int DFS(int start) {
        if(start == end) return distance;
        else {
            for(int i = 1; i <= V; i++) {
                if(graph[start][i] == 1 && !visited[i]) {
                    visited[start] = true;
                    DFS(i);
                }
            }
        }
        return -1;
    }
}
