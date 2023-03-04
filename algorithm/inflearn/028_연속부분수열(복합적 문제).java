import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();  // N개의 수
        int m = in.nextInt();  // 특정 숫자 M
        int[] array = new int[n];
        for (int i=0; i<n; i++) {
            array[i] = in.nextInt();
        }
        System.out.println(T.solution(n, m, array));
    }

    public int solution(int n, int m, int[] array) {
        int answer = 0;

        // 이중 for문을 사용하면 시간 복잡도가 O(n2) 된다.
        /**
        for (int i=0; i<n; i++) {
            int sum = array[i];
            for (int k=i; k<n; k++) {
                sum += array[k];
                if (sum == m) answer++;
                if (sum > m) continue;
            }
        }
         **/

        // O(n2) -> O(n) 으로 풀어야한다.
        // two pointers algorithm + Sliding window
        int sum = 0, lt =0;
        for (int rt=0; rt<n; rt++) {     // 오른쪽 포인터가 끝으로 이동할 때까지 반복한다.
            sum += array[rt];            // 오른쪽 포인터가 가리키는 값을 sum에 더한다.
            if (sum == m) answer++;      // 만약 sum이 특정 숫자 m과 같은 경우 answer을 1 증가한다.

            while (sum >= m) {           // 만약 sum이 m과 같거나 큰 경우 반복한다.
                sum -= array[lt++];      // -> sum에서 왼쪽 포인터가 가리키는 값을 뺀 뒤, 해당 포인터를 한칸 이동시킨다.
                if (sum == m) answer++;  // -> 만약 sum이 m과 같은 경우 answer을 1 증가한다.
            }
        }
        return answer;
    }
}