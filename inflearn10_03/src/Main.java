import java.util.Scanner;

public class Main {
    static int[] dy;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        dy = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        solution(N, arr);
    }
    public static void solution(int N, int[] arr) {
        int answer = 0;
        dy[0] = 1;
        for(int i = 1; i < N; i++) {
            int max = 0;
            for(int j = i - 1; j >= 0; j--) {
                if(arr[j] < arr[i] && dy[j] > max) {
                    max = dy[j];
                }
            }
            dy[i] = max + 1;
            answer = Math.max(answer, dy[i]);
        }
        System.out.println(answer);
    }
}
