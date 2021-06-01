import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

class Block implements Comparable<Block>{
    int area, height, weight;
    public Block(int area, int height, int weight) {
        this.area = area;
        this.height = height;
        this.weight = weight;
    }
    @Override
    public int compareTo(Block o) {
        return o.area - this.area;
    }
}
public class Main {
    static int[] dy;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dy = new int[n];
        ArrayList<Block> arr = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int h = sc.nextInt();
            int w = sc.nextInt();
            arr.add(new Block(a, h, w));
        }
        System.out.println(solution(arr));

    }
    public static int solution(ArrayList<Block> arr) {
        Collections.sort(arr);

        dy[0] = arr.get(0).height;
        int answer = dy[0];
        for(int i = 1; i < arr.size(); i++) {
            int currW = arr.get(i).weight;
            int max = 0;
            for(int j = i - 1; j >= 0; j--) {
                if(arr.get(j).weight > currW) {
                    max = Math.max(max, dy[j]);
                }
            }
            dy[i] = max + arr.get(i).height;
            answer = Math.max(answer, dy[i]);
        }
        return answer;
    }
}
