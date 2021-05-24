import java.util.ArrayList;
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
    static int[][] town;
    static int len;
    static int[] combi;
    static int answer = Integer.MAX_VALUE;
    static ArrayList<Pos> house = new ArrayList<>();
    static ArrayList<Pos> pizza = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        town = new int[N][N];
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                int tmp = sc.nextInt();
                if(tmp == 1) house.add(new Pos(i, j));
                else if(tmp == 2) pizza.add(new Pos(i, j));
            }
        }
        len = pizza.size();
        combi = new int[M];
        dfs(0, 0);
        System.out.println(answer);
    }
    public static void dfs(int L, int s) {
        if(L == M) {
            int sum = 0;
            for(int i = 0; i < house.size(); i++) {
                int min = Integer.MAX_VALUE;
                for(int j = 0; j < combi.length; j++) {
                    min = Math.min(min, Math.abs(house.get(i).x - pizza.get(combi[j]).x) + Math.abs(house.get(i).y - pizza.get(combi[j]).y));
                }
                sum += min;
            }
            answer = Math.min(answer, sum);
        } else {
            for(int i = s; i < len; i++) {
                combi[L] = i;
                dfs(L + 1, i + 1);
            }
        }
    }
}
