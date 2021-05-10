import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        for(int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++) {
            B[i] = sc.nextInt();
        }
        for(char x : solution(n, A, B)) {
            System.out.println(x);
        }
    }
    public static ArrayList<Character> solution(int n, int[] A, int[] B) {
        ArrayList<Character> myList = new ArrayList<Character>();

        for(int i = 0; i < n; i++) {
            if(A[i] == 1) {
                if(B[i] == 1) {
                    myList.add('D');
                } else if(B[i] == 2) {
                    myList.add('B');
                }
            } else if(A[i] == 2) {
                if(B[i] == 1) {
                    myList.add('A');
                } else if(B[i] == 2) {
                    myList.add('D');
                }
            } else {
                if(B[i] == 1) {
                    myList.add('B');
                } else if(B[i] == 2) {
                    myList.add('A');
                }
            }
            if(A[i] == B[i]) {
                myList.add('D');
            }
        }
        return myList;
    }
}
