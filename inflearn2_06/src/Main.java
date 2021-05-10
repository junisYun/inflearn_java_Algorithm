import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] numbers = new int[n];
        for(int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        for(int x : solution(n, numbers)) {
            System.out.print(x + " ");
        }
    }
    public static ArrayList<Integer> solution(int n, int[] numbers) {
        ArrayList<Integer> myList = new ArrayList<Integer>();
        int[] isPrime = new int[100001];
        isPrime[0] = 1;
        isPrime[1] = 1;
        for(int i = 2; i <= 100000; i++) {
            if(isPrime[i] != 1) {
                for(int j = i + i; j <= 100000; j = j + i) {
                    isPrime[j] = 1;
                }
            }
        }

        for(int i = 0; i < n; i++) {
            String str = String.valueOf(numbers[i]);
            StringBuilder s = new StringBuilder(str);
            int temp = Integer.parseInt(s.reverse().toString());
            if(isPrime[temp] == 0) {
                myList.add(temp);
            }
        }
        return myList;
    }
}
