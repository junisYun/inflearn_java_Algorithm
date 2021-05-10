import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len1 = sc.nextInt();
        int[] arr1 = new int[len1];
        for(int i = 0; i < len1; i++) {
            arr1[i] = sc.nextInt();
        }

        int len2 = sc.nextInt();
        int[] arr2 = new int[len2];
        for(int i = 0; i < len2; i++) {
            arr2[i] = sc.nextInt();
        }

        for(int x : solution(len1, len2, arr1, arr2)) {
            System.out.print(x + " ");
        }
    }
    public static ArrayList<Integer> solution(int len1, int len2, int[] arr1, int[] arr2) {
        ArrayList<Integer> myList = new ArrayList<Integer>();
        int p1 = 0, p2 = 0;
        while(p1 < len1 && p2 < len2) {
            if(arr1[p1] <= arr2[p2]) {
                myList.add(arr1[p1]);
                p1++;
            } else {
                myList.add(arr2[p2]);
                p2++;
            }
        }
        while(p1 < len1) {
                myList.add(arr1[p1]);
                p1++;
        }
        while(p2 < len2) {
                myList.add(arr2[p2]);
                p2++;
        }
        return myList;
    }
}
