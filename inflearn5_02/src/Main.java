import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        System.out.println(solution(s));
    }

    public static String solution(String s) {
        Stack<Character> stk = new Stack<>();
        String answer = "";
/*        for(char ch : s.toCharArray()) {
            if(ch == '(') {
                stk.push(ch);
            } else if(ch == ')') {
                stk.pop();
            } else if(stk.isEmpty()) {
                System.out.print(ch);
            }
        }*/

        for(char ch : s.toCharArray()) {
            if(ch == ')') {
                while(stk.pop() != '(');
            } else {
                stk.push(ch);
            }
        }
        for(int i = 0; i < stk.size(); i++) {
            answer += stk.get(i);
        }

        return answer;
    }
}
