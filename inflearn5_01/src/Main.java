import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        System.out.println(solution(s));
    }

    public static String solution(String s) {
        String answer = "YES";
        Stack<Character> stk = new Stack<>();

        for(char ch : s.toCharArray()) {
            if(ch == '(') {
                stk.push(ch);
            } else {
                if(stk.isEmpty())
                    return "NO";
                stk.pop();
            }
        }
        if(!stk.isEmpty()) {
            answer = "NO";
        }
        return answer;
    }
}