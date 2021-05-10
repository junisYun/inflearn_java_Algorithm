import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char ch = sc.next().charAt(0);

        System.out.println(solution(str, ch));
    }

    public static int solution(String str, char ch) {
        int answer = 0;
        for(char x : str.toLowerCase().toCharArray()) {
            if(Character.toLowerCase(ch) == x) {
                answer++;
            }
        }
        return answer;
    }
}
