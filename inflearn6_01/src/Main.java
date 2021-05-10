import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] num = new int[N];
        for(int i = 0; i < N; i++) {
            num[i] = sc.nextInt();
        }

        for(int x : solution(N, num)) {
            System.out.print(x + " ");
        }
    }

    public static int[] solution(int N, int[] num) {
        for(int i = 0; i < N - 1; i++) {
            int idx = i;
            for(int j = i + 1; j < N; j++) {
                if(num[j] < num[idx]) idx = j;
            }
            int tmp = num[i];
            num[i] = num[idx];
            num[idx] = tmp;
        }
        return num;
    }
}
