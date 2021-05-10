import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char[] charArr = str.toCharArray();

        int pl = 0, pr = str.length() - 1;
        while(pl < pr) {
            if(!Character.isLetter(charArr[pl])) pl++;
            else if(!Character.isLetter(charArr[pr])) pr--;
            else {
                char tmp = charArr[pl];
                charArr[pl] = charArr[pr];
                charArr[pr] = tmp;
                pl++;
                pr--;
            }
        }
        String answer = String.valueOf(charArr);
        System.out.println(answer);
    }
}
