import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] str = new String[n];

        for(int i = 0; i < n; i++) {
            str[i] = sc.next();
        }

        // 직접 역순으로 바꿔서 출력
        for(int i = 0; i < str.length; i++) {
            String answer = "";
            for(int j = 1; j <= str[i].length(); j++) {
                answer += str[i].charAt(str[i].length() - j);
            }
            System.out.println(answer);
        }

        // StringBuilder 사용 예시
        for(int i = 0; i < str.length; i++) {
            String answer = new StringBuilder(str[i]).reverse().toString();
            System.out.println(answer);
        }
    }
}
