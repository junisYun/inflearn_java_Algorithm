import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(solution(str));
    }
    public static int solution(String str) {
        // replaceAll, 정규식 사용
        /*str = str.replaceAll("[^0-9]", "");
        int answer = Integer.parseInt(str);

        return answer;*/

        // 직접 추출
        List<Character> myList = new ArrayList<Character>();
        for(char ch : str.toCharArray()) {
            if(Character.isDigit(ch)) {
                myList.add(ch);
            }
        }
        StringBuilder s = new StringBuilder();
        for(int i = 0; i < myList.size(); i++) {
            s.append(myList.get(i));
        }
        int answer = Integer.parseInt(s.toString());
        return answer;
    }
}
