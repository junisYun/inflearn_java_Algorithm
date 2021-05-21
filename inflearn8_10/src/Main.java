import java.util.Scanner;

public class Main {
    static int[][] maze = new int[7][7];
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static int answer = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 7; i++) {
            for(int j = 0; j < 7; j++) {
                maze[i][j] = sc.nextInt();
            }
        }
        maze[0][0] = 1;
        dfs(0, 0);
        System.out.println(answer);
    }
    public static void dfs(int x, int y) {
        if(x == 6 && y == 6) {
            answer++;
        } else {
            for(int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx >= 0 && nx < 7 && ny >= 0 && ny < 7) {
                    if (maze[nx][ny] == 0) {
                        maze[nx][ny] = 1;
                        dfs(nx, ny);
                        maze[nx][ny] = 0;
                    }
                }
            }
        }
    }
}
