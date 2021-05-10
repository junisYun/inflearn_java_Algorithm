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
    static int N, M;
    static int[][] box;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        box = new int[M][N];

        for(int i = 0; i < M; i++) {
            for(int j = 0; j < N; j++) {
                box[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution());
    }
    public static int solution() {
        Queue<Pos> q = new LinkedList<>();
        for(int i = 0; i < M; i++) {
            for(int j = 0; j < N; j++) {
                if(box[i][j] == 1) {
                    q.offer(new Pos(i, j));
                }
            }
        }
        while(!q.isEmpty()) {
            Pos p = q.poll();
            int x = p.x;
            int y = p.y;
            for(int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx >= 0 && nx < M && ny >= 0 && ny < N) {
                    if(box[nx][ny] == 0) {
                        box[nx][ny] = box[x][y] + 1;
                        q.offer(new Pos(nx, ny));
                    }
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < M; i++) {
            for(int j = 0; j < N; j++) {
                max = Math.max(max, box[i][j]);
                if(box[i][j] == 0) {
                    return -1;
                }
            }
        }
        return max == 1 ? 0 : max - 1;
    }
}
