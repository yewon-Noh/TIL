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
        int answer = 0, cnt = 1;  // cnt는 연속된 숫자의 개수

        n--;  // cnt가 1이므로 n-1을 해준다.

        while (n>0) {
            cnt++;
            n=n-cnt;  // n에서 cnt 만큼 빼면서 진행한다.
            // 남은 n이 cnt로 나눴을 때 나머지가 0이면 가능한 경우이다.
            if (n%cnt == 0) answer++;
        }

        /**
         이해를 위한 전체 그림(n=15일때)

         루프    n     cnt     answer
          0     14     1        0
          1     12     2        1
          2      9     3        2
          3      5     4        2
          4      0     5        3

         **/

        return answer;
    }
}