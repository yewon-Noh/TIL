import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(T.solution(n));
    }

    /**
     * 만약 n=15이면,
     * (7+8), (4+5+6), (1+2+3+4+5)로 3가지의 경우가 존재한다.
     */
    public int solution(int n) {
        int answer = 0, sum = 0;

        // 연속된 자연수의 가장 큰 숫자는 (n/2)+1 이다.
        // 예, n=15일때 연속된 가장 큰 숫자의 합은 7+8이다.
        // 배열로 생성한다.
        int m = (n/2)+1;
        int[] array = new int[m];
        for (int i=0; i<m; i++) {
            array[i] = i+1;
        }

        // 포인터 생성
        // 연속된 자연수의 합이 n인 경우를 구한다.
        int lt=0;
        for (int rt=0; rt<m; rt++) {
            sum += array[rt];
            if (sum == n) answer++;
            while (sum >= n) {
                sum -= array[lt++];
                if (sum == n) answer++;
            }
        }
        return answer;
    }
}