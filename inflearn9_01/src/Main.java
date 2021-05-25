import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Player implements Comparable<Player>{
    int height, weight;
    public Player(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }
    @Override
    public int compareTo(Player o) {
        if(this.height != o.height) return o.height - this.height;
        else return o.weight - this.weight;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int answer = 0;
        ArrayList<Player> arr = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            int height = sc.nextInt();
            int weight = sc.nextInt();
            arr.add(new Player(height, weight));
        }
        Collections.sort(arr);
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.size(); i++) {
            if(max < arr.get(i).weight) {
                max = arr.get(i).weight;
                answer++;
            }
        }
        System.out.println(answer);
    }
}
