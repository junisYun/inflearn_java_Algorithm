import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Lecture implements Comparable<Lecture>{
    int money, time;
    public Lecture(int money, int time) {
        this.money = money;
        this.time = time;
    }
    @Override
    public int compareTo(Lecture o) {
        if(this.time == o.time) return o.money - this.money;
        else return o.time - this.time;
    }
}
public class Main {
    static int N, max;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        ArrayList<Lecture> arr = new ArrayList<>();
        max = Integer.MIN_VALUE;
        for(int i = 0; i < N; i++) {
            int money = sc.nextInt();
            int time = sc.nextInt();
            if(max < time) max = time;
            arr.add(new Lecture(money, time));
        }
        Collections.sort(arr);
        System.out.println(solution(arr));
    }
    public static int solution(ArrayList<Lecture> arr) {
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
        int sum = 0;
        int j = 0;
        for(int i = max; i >= 1; i--) {
            for( ; j < N; j++) {
                if(arr.get(j).time < i) break;
                pQ.offer(arr.get(j).money);
            }
            if(!pQ.isEmpty()) {
                sum +=pQ.poll();
            }
        }
        return sum;
    }
}
