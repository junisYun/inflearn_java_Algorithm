import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person {
    int id, priority;
    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] patient = new int[N];
        for(int i = 0; i < N; i++) {
            patient[i] = sc.nextInt();
        }

        System.out.println(solution(N, M, patient));
    }

    public static int solution(int N, int M, int[] patient) {
        Queue<Person> q = new LinkedList<>();
        int answer = 0;
        for(int i = 0; i < N; i++) {
            q.offer(new Person(i, patient[i]));
        }

        while(!q.isEmpty()) {
            boolean flag = true;
            Person p = q.poll();
            for(Person x : q) {
                if(x.priority > p.priority) {
                    flag = false;
                    q.offer(p);
                    break;
                }
            }
            if(flag) {
                answer++;
                if(p.id == M) {
                    return answer;
                }
            }

        }
        return answer;
    }
}
