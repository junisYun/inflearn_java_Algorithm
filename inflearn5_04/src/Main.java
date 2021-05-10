import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        System.out.println(solution(s));
    }

    public static int solution(String s) {
        Stack<Integer> stk = new Stack<>();
        for(char ch : s.toCharArray()) {
            int tmp1 = 0, tmp2 = 0;
            if(!Character.isDigit(ch)) {
                tmp1 = stk.pop(); tmp2 = stk.pop();
                if(ch == '+') {
                    stk.push(tmp2 + tmp1);
                } else if(ch == '-') {
                    stk.push(tmp2 - tmp1);
                } else if(ch == '*') {
                    stk.push(tmp2 * tmp1);
                } else {
                    stk.push(tmp2 / tmp1);
                }
            } else {
                stk.push(ch - 48);
            }
        }
        return stk.peek();
    }
}
