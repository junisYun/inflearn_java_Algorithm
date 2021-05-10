import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
            if(i == 0) {
                System.out.print(num[i] + " ");
            } else {
                if (num[i] > num[i - 1]) {
                    System.out.print(num[i] + " ");
                }
            }
        }
    }
}
