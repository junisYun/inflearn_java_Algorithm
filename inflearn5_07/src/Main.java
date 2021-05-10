import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        System.out.println(solution(str1, str2));
    }

    public static String solution(String str1, String str2) {
        Queue<Character> q = new LinkedList<Character>();
        for(char ch : str1.toCharArray()) {
            q.offer(ch);
        }
        for(char ch : str2.toCharArray()) {
            if (q.size() >= 1 && ch == q.peek()) {
                q.poll();
            }
        }
        return q.isEmpty() ? "YES" : "NO";
    }
}
