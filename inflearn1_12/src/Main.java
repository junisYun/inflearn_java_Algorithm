import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();

        System.out.println(solution(n, str));
    }
    public static String solution(int n, String str) {
        String answer = "";
        String[] s = new String[n];
        for(int i = 0; i < str.length() / 7; i++) {
            s[i] = str.substring(i * 7, (i + 1) * 7);
        }

        for(int i = 0; i < n; i++) {
            String word = "";
            for(int j = 0; j < 7; j++) {
                if(s[i].charAt(j) == '#') {
                    word += "1";
                } else {
                    word += "0";
                }
            }
            int num = Integer.parseInt(word);
            int sum = 0;
            int p = 0;
            while(num != 0) {
                if(num % 10 == 1) {
                    sum += Math.pow(2, p);
                }
                p++;
                num /= 10;
            }
            char w = (char)sum;
            answer += String.valueOf(w);
        }
        return answer;
    }
}
