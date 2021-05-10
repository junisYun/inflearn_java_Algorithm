import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person {
    int id, danger;
    public Person(int id, int danger) {
        this.id = id;
        this.danger = danger;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] danger = new int[N];
        for(int i = 0; i < N; i++) {
            danger[i] = sc.nextInt();
        }

        System.out.println(solution(N, M, danger));
    }

    public static int solution(int N, int M, int[] danger) {
        Queue<Person> q = new LinkedList<>();
        int answer = 0;
        for(int i = 0; i < N; i++) {
            q.offer(new Person(i, danger[i]));
        }

        while(!q.isEmpty()) {
            Person tmp = q.poll();
            boolean flag = true;
            for(Person x : q) {
                if(x.danger > tmp.danger) {
                    q.offer(tmp);
                    flag = false;
                    break;
                }
            }
            if(flag) {
                answer++;
                if (tmp.id == M) {
                    return answer;
                }
            }
        }
        return answer;
    }
}
