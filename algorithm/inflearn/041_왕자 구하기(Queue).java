import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        System.out.println(T.solution(n, k));
    }

    // Queue 사용
    public int solution(int n, int k) {
        int answer = 0;

        // 왕자 목록을 Queue에 저장한다.
        Queue<Integer> queue = new LinkedList<>();
        for (int i=1; i<=n; i++) queue.offer(i);  // queue.offer(i) : 값 i를 추가한다.

        while (!queue.isEmpty()) {
            // 첫번째 왕자부터 K-1번째 왕자를 순서대로 맨 앞에서 뒤로 이동시킨다.
            for (int i=1; i<k; i++) {
                queue.offer(queue.poll());  // queue.poll() : 맨 앞의 값을 꺼내고 제거한다.
            }
            // K 번째 왕자는 제거한다.
            queue.poll();
            // 왕자가 한명만 남으면 answer에 넣는다.
            if (queue.size() == 1) answer=queue.poll();   // poll() 해주면 queue가 비어버리므로 while 조건에 걸려 끝난다.
        }

        return answer;
    }
}
