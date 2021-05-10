import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] student = new int[n];
        for(int i = 0; i < n; i++) {
            student[i] = sc.nextInt();
        }

        System.out.println(solution(student));

    }
    public static int solution(int[] student) {
        // 이중 for문 방법 -> O(n^2)이기 때문에 n 이 커지면 시간 초과날 수 있으므로 비추천
/*        int cnt = 1;
        for(int i = 1; i < student.length; i++) {
            boolean flag = true;
            for(int j = 0; j < i; j++) {
                if(student[i] <= student[j]) {
                    flag = false;
                    break;
                }
            }
            if(flag) cnt++;
        }
        return cnt;*/


        // 최대값 방법
        int max = student[0];
        int cnt = 1;
        for(int i = 1; i < student.length; i++) {
            if(student[i] > max) {
                cnt++;
                max = student[i];
            }
        }
        return cnt;
    }
}
