import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        StringBuilder answer = new StringBuilder();

/*      // 해쉬 맵 사용
        Set<Character> mySet = new HashSet<Character>();

        for(int i = 0; i < str.length(); i++) {
            if(!mySet.contains(str.charAt(i))) {
                answer.append(str.charAt(i));
            }
            mySet.add(str.charAt(i));
        }
        System.out.println(answer);
        */


        // indexOf 사용
        for(int i = 0; i < str.length(); i++) {
            if(i == str.indexOf(str.charAt(i))) {
                answer.append(str.charAt(i));
            }
        }
        System.out.println(answer);
    }
}
