import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(solution(str));

    }
    public static StringBuilder solution(String str) {
        StringBuilder s = new StringBuilder();
        for(char ch : str.toCharArray()) {
            if(Character.isLowerCase(ch)) {
                s.append((char)(ch - 32));
            }
            else {
                s.append((char)(ch + 32));
            }
        }
        return s;
    }
}
