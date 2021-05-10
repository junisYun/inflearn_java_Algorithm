import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(solution(str));
    }

    public static String solution(String str) {
        String[] word = str.split(" ");

        int length = Integer.MIN_VALUE;
        String answer = "";
        for(int i = 0; i < word.length; i++) {
            if(length < word[i].length()) {
                length = word[i].length();
                answer = word[i];
            }
        }
        return answer;
    }
}