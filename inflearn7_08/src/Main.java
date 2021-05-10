import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int[] position = new int[10001];
    static int s;
    static int e;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        s = sc.nextInt();
        e = sc.nextInt();

        System.out.println(solution());
    }

    public static int solution() {
        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(s);
        position[s] = 1;

        while (!q.isEmpty()) {
            int pos = q.poll();
            for (int i = 0; i < 3; i++) {
                int nPos;
                if (i == 0) {
                    nPos = pos + 1;
                } else if (i == 1) {
                    nPos = pos - 1;
                } else {
                    nPos = pos + 5;
                }
                if (nPos == e) {
                    return position[pos];
                }
                if (nPos >= 0 && nPos < position.length && position[nPos] == 0) {
                    q.offer(nPos);
                    position[nPos] = position[pos] + 1;
                }
            }
        }
        return -1;
    }
}