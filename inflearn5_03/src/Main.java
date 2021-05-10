import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] board = new int[N][N];
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        int M = sc.nextInt();
        int[] moves = new int[M];
        for(int i = 0; i < M; i++) {
            moves[i] = sc.nextInt();
        }
        System.out.println(solution(board, moves));
    }

    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stk = new Stack<>();

        for(int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][moves[i] - 1] != 0) {
                    stk.push(board[j][moves[i] - 1]);
                    board[j][moves[i] - 1] = 0;
                    break;
                }
            }
            if (stk.size() >= 2) {
                if (stk.get(stk.size() - 1).equals(stk.get(stk.size() - 2))) {
                    stk.pop();
                    stk.pop();
                    answer += 2;
                }
            }
        }
        return answer;
    }
}
