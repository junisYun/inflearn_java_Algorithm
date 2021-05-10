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
            for(int j = 0; j < N - i - 1; j++) {
                if(num[j] > num[j + 1]) {
                    int tmp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = tmp;
                }
            }
        }

        return num;
    }
}
