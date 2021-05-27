import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time implements Comparable<Time>{
    int time;
    char status;
    public Time(int time, char status) {
        this.time = time;
        this.status = status;
    }
    @Override
    public int compareTo(Time o) {
        if(this.time == o.time) return this.status - o.status;
        else return this.time - o.time;
    }

}
public class Main {
    static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        ArrayList<Time> arr = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            int st = sc.nextInt();
            int et = sc.nextInt();
            arr.add(new Time(st, 's'));
            arr.add(new Time(et, 'e'));
        }
        System.out.println(solution(arr));
    }
    public static int solution(ArrayList<Time> arr) {
        int answer = Integer.MIN_VALUE;
        Collections.sort(arr);
        int cnt = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i).status == 's') {
                cnt++;
            } else {
                cnt--;
            }
            if(answer < cnt) {
                answer = cnt;
            }
        }
        return answer;
    }
}
