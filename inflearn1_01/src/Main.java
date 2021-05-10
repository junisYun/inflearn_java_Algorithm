import java.util.Scanner;

public class Main {
    public int solution(String s, char c) {
        int cnt = 0;
        for(char ch : s.toLowerCase().toCharArray()) {
            if(c == ch) {
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Main t = new Main();
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char c = sc.next().toLowerCase().charAt(0);

        System.out.println(t.solution(s, c));
    }
}
