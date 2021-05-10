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
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static int[][] maze = new int[7][7];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 7; i++) {
            for(int j = 0; j < 7; j++) {
                maze[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(new Pos(0, 0)));
    }

    public static int solution(Pos pos) {
        Queue<Pos> q = new LinkedList<>();
        q.offer(pos);


        while(!q.isEmpty()) {
            Pos p = q.poll();
            int x = p.x;
            int y = p.y;
            for(int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx >= 0 && nx < 7 && ny >= 0 && ny < 7) {
                    if(maze[nx][ny] == 0) {
                        maze[nx][ny] = maze[x][y] + 1;
                        if(nx == 6 && ny == 6) {
                            return maze[nx][ny];
                        }
                        q.offer(new Pos(nx, ny));
                    }
                }
            }
        }
        return -1;
    }
}
