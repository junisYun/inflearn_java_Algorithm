import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Class implements Comparable<Class>{
    int start, end;
    public Class(int start, int end) {
        this.start = start;
        this.end = end;
    }
    public int compareTo(Class o) {
        if(this.end == o.end) return this.start - o.start;
        else return this.end - o.end;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 1;
        ArrayList<Class> arr = new ArrayList<>();
        int N = sc.nextInt();
        for(int i = 0; i < N; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            arr.add(new Class(start, end));
        }
        Collections.sort(arr);
        int x = arr.get(0).end;
        for(int i = 1; i < arr.size(); i++) {
            if(x <= arr.get(i).start) {
                x = arr.get(i).end;
                answer++;
            }
        }
        System.out.println(answer);
    }
}
