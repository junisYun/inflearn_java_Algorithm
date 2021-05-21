import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Pos {
    int x, y;
    public Pos(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Main {
    static int N;
    static int[][] island;
    static int[] dx = {0, 1, 0, -1, 1, 1, -1, -1};
    static int[] dy = {1, 0, -1, 0, 1, -1, -1, 1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        N = sc.nextInt();
        island = new int[N][N];
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                island[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(island[i][j] == 1) {
                    island[i][j] = 0;
                    answer++;
                    bfs(new Pos(i, j));
                }
            }
        }
        System.out.println(answer);
    }
    public static void bfs(Pos p) {
        Queue<Pos> q = new LinkedList<>();
        q.offer(p);
        while(!q.isEmpty()) {
            Pos pos = q.poll();
            int x = pos.x;
            int y = pos.y;
            for(int i = 0; i < 8; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx >= 0 && nx < N && ny >= 0 && ny < N) {
                    if(island[nx][ny] == 1) {
                        island[nx][ny] = 0;
                        q.offer(new Pos(nx, ny));
                    }
                }
            }
        }
    }
}
