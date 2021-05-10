import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.println(solution(str) ? "YES" : "NO");
    }

    public static boolean solution(String str) {
        // 리스트 사용
/*        List<Character> myList = new ArrayList<Character>();
        for(char c : str.toLowerCase().toCharArray()) {
            if(Character.isLetter(c)) {
                myList.add(c);
            }
        }
        int len = myList.size() - 1;

        for(int i = 0; i < myList.size() / 2; i++) {
            if(myList.get(i) != myList.get(len - i)) {
                return false;
            }
        }
        return true;*/

        // replaceAll, 정규식 사용
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String s = new StringBuilder(str).reverse().toString();
        return str.equals(s);
    }
}
