import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(solution(str));
    }
    public static String solution(String str) {
        str += " ";
        String answer = "";
        char[] ch = new char[str.length()];
        for(int i = 0; i < ch.length; i++) {
            ch[i] = str.charAt(i);
        }
        int cnt = 1;

        for(int i = 0; i < ch.length; i++) {
            if(i != ch.length - 1) {
                if (ch[i] == ch[i + 1]) {
                    cnt++;
                    continue;
                }
                if (cnt > 1) {
                    answer += ch[i] + String.valueOf(cnt);
                } else {
                    answer += ch[i];
                }
                cnt = 1;
            }
        }
        return answer;
    }
}