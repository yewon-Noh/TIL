import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

class Person {
    int id;
    int priority;
    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}

public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] array = new int[n];
        for (int i=0; i<n; i++) array[i] = in.nextInt();
        System.out.println(T.solution(n, m, array));
    }

    public int solution(int n, int m, int[] array) {
        int answer = 0;
        Queue<Person> Q = new LinkedList<>();
        for (int i=0; i<n; i++) Q.offer(new Person(i, array[i]));

        while (!Q.isEmpty()) {
            Person now = Q.poll();  // 제일 앞에 있는 환자목록을 꺼낸다.
            for (Person x: Q) {
                if (x.priority > now.priority) {  // 꺼낸 환자보다 위험도가 높은 환자가 존재하면
                    Q.offer(now);                 // 대기목록 제일 뒤로 다시 넣는다.
                    now = null;
                    break;
                }
            }
            if (now != null) {                    // 꺼낸 환자보다 위험도가 높은 환자가 존재하지 않는 경우
                answer++;                         // 진료 순서(answer)을 증가한 뒤,
                if (now.id == m) return answer;   // m번째 환자인 경우 answer을 반환한다.
            }
        }
        return answer;
    }
}
