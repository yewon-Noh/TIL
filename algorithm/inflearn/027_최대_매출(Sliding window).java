import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();  // N일 동안 매출 기록
        int k = in.nextInt();  // 연속 K일
        int[] array = new int[n];
        for (int i=0; i<n; i++) {
            array[i] = in.nextInt();
        }
        System.out.println(T.solution(n, k, array));
    }


    public int solution(int n, int k, int[] array) {
        int answer = 0, sum = 0;

        // Sliding window[효율성 : O(n^2)-->O(n)]

        // 1. 첫번째 윈도우
        for (int i=0; i<k; i++) sum += array[i];
        answer = sum;

        // 2. 두번째부터 마지막 윈도우
        for (int i=k; i<n; i++) {
            // 윈도우를 오른쪽으로 한칸 이동 할 때
            // a, b, c, d
            // 이전의 합(a+b+c)에 오른쪽 값(d)를 더한 후, 윈도우 가장 왼쪽에 위치했던 값(a)을 뺀다.
            // 즉, (a+b+c)+d-a = b+c+d가 된다.
            sum = sum + array[i] - array[i-k];
            answer = Math.max(answer, sum);
        }

        return answer;
    }
}