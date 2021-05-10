import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        solution(str);
    }

    public static void solution(String str) {
        int answer = 0;
        Stack<Character> stk = new Stack<>();

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ')') {
                stk.pop();
                if(str.charAt(i - 1) == '(') { // 레이저
                    answer += stk.size();
                } else {
                    answer += 1;
                }
            }
            else {
                stk.push('(');
            }
        }

        System.out.println(answer);
    }
}
