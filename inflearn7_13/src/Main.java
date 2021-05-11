import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<ArrayList<Integer>> graph;
    static int V, E;
    static boolean[] visited;
    static int answer = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        V = sc.nextInt();
        E = sc.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for(int i = 1; i <= V; i++) {
            graph.add(new ArrayList<Integer>());
        }
        visited = new boolean[V + 1];
        for(int i = 0; i < E; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            graph.get(x).add(y);
        }
        visited[1] = true;
        DFS(1);
        System.out.println(answer);
    }
    public static void DFS(int start) {
        if(start == V) answer++;
        else {
            for(int nv : graph.get(start)) {
                if(!visited[nv]) {
                    visited[nv] = true;
                    DFS(nv);
                    visited[nv] = false;
                }
            }
        }
    }
}
