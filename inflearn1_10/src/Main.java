import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char t = sc.next().charAt(0);

        for(int n : solution(str, t)) {
            System.out.print(n + " ");
        }
    }
    public static int[] solution(String str, char t) {
        int[] rightDir = new int[str.length()];
        int[] leftDir = new int[str.length()];
        int p;

        p = 1000;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == t) {
                p = 0;
            }
            rightDir[i] = p++;
        }

        p = 1000;
        for(int i = str.length() - 1; i >= 0; i--) {
            if(str.charAt(i) == t) {
                p = 0;
            }
            leftDir[i] = p++;
        }
        for(int i = 0; i < rightDir.length; i++) {
            rightDir[i] = Math.min(rightDir[i], leftDir[i]);
        }

        return rightDir;
    }
}
